package com.azure.csu.tiger.web.controller;

import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.web.vo.SkuListVO;
import com.azure.csu.tiger.web.vo.SkuDetailVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Api(tags = "Product Rest API interface")
@RefreshScope
@RestController
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GrpcClient("emall-product")
    private ProductGrpc.ProductBlockingStub productStub;

//    @RequestMapping("/category/list")
//    public List<CategoryVO> listCategory(@RequestParam(required = false) String name, @RequestParam(required = false) Long parentId) throws ExecutionException, InterruptedException {
//
//        CategoryListResponse response = productStub.listCategory(FindCategoryRequest.newBuilder().setName(name).setParentId(parentId == null ? -1 : parentId).build());
//
//        List<CategoryVO> voList = response.getDatasList().stream().map(c -> CategoryVO.newCategoryFrom(c)).collect(Collectors.toList());
//        return voList;
//    }

    @ApiOperation(value = "商品查询", notes = "纯Mysql查询")
    @GetMapping("/product/search")
    public ResponseEntity<List<SkuListVO>> searchSku(@RequestParam(required = false) String name, @RequestParam(required = false) Long categoryId,
                                                     @RequestParam(required = true) int pageNo, @RequestParam(required = true) int pageNum) {
        logger.info("name: {}, categoryId: {}, pageNo: {}, pageNum: {}", name, categoryId, pageNo, pageNum);
        ListSkuRequest2.Builder builder = ListSkuRequest2.newBuilder();
        if (name != null) {
            builder.setName(name);
        }
        if (categoryId == null) {
            categoryId = -1L;
        }
        builder.setCategoryId(categoryId);
        builder.setOffset((pageNo - 1) * pageNum);
        builder.setLimit(pageNum);

        ListSkuInfoResponse response = productStub.searchSku(builder.build());

        if (response.getSuccess()) {
            return ResponseEntity.ok(response.getDatasList().stream().map( data -> SkuListVO.from(data)).collect(Collectors.toList()));
        }

        return ResponseEntity.badRequest().build();
    }

    @ApiOperation(value = "商品详情", notes = "纯Redis查询")
    @GetMapping("/product/detail")
    public ResponseEntity<SkuDetailVO> findSkuDetail(@RequestParam(required = true) Long skuId) {

        GetSkuDetailResponse response = productStub.getSkuDetailInfo(GetSkuDetailRequest.newBuilder().setSkuId(skuId).build());

        if (response.getSuccess()) {
            return ResponseEntity.ok(SkuDetailVO.from(response.getData()));
        }

        return ResponseEntity.badRequest().build();
    }
}

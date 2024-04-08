package com.azure.csu.tiger.web.controller;

import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.web.vo.CategoryVO;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@RefreshScope
@RestController
public class ProductController {

    @GrpcClient("emall-product")
    private ProductGrpc.ProductBlockingStub productStub;

    @RequestMapping("/category/list")
    public List<CategoryVO> listCategory(@RequestParam(required = false) String name, @RequestParam(required = false) Long parentId) throws ExecutionException, InterruptedException {

        CategoryListResponse response = productStub.listCategory(FindCategoryRequest.newBuilder().setName(name).setParentId(parentId == null ? -1 : parentId).build());

        List<CategoryVO> voList = response.getDatasList().stream().map(c -> CategoryVO.newCategoryFrom(c)).collect(Collectors.toList());
        return voList;
    }
}

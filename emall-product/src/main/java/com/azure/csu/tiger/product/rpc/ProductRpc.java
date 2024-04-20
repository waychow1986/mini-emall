package com.azure.csu.tiger.product.rpc;

import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.product.cache.bo.SkuItemBo;
import com.azure.csu.tiger.product.dto.CategoryDTO;
import com.azure.csu.tiger.product.service.CategoryService;
import com.azure.csu.tiger.product.service.SkuService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ProductRpc extends ProductGrpc.ProductImplBase {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SkuService skuService;

    @Override
    public void listCategory(FindCategoryRequest request, StreamObserver<CategoryListResponse> responseObserver) {
        String name = request.getName();
        Long parentId = request.getParentId();

        List<CategoryDTO> categoryDTOS = categoryService.listCategory(name, parentId);
        List<Category> categoryList = categoryDTOS.stream().map(c -> c.toGrpcCategory()).collect(Collectors.toList());

        CategoryListResponse response = CategoryListResponse.newBuilder().addAllDatas(categoryList).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listSkuInfo(ListSkuRequest request, StreamObserver<ListSkuInfoResponse> responseObserver) {
        List<Long> skuIds = request.getSkuIdList();

        List<SkuItemBo> infoBos = skuService.findSkuInfoFromCache(skuIds);
        List<SkuInfo> skuInfos = infoBos.stream().map(info -> info.toGrpcSkuInfo()).collect(Collectors.toList());

        ListSkuInfoResponse response = ListSkuInfoResponse.newBuilder().addAllDatas(skuInfos).setSuccess(true).setCode(Constant.SUCCESS).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}

package com.azure.csu.tiger.product.rpc;

import com.azure.csu.tiger.grpc.lib.Category;
import com.azure.csu.tiger.grpc.lib.CategoryListResponse;
import com.azure.csu.tiger.grpc.lib.FindCategoryRequest;
import com.azure.csu.tiger.grpc.lib.ProductGrpc;
import com.azure.csu.tiger.product.dto.CategoryDTO;
import com.azure.csu.tiger.product.service.CategoryService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

//@GrpcService
public class ProductRpc extends ProductGrpc.ProductImplBase {

    @Autowired
    private CategoryService categoryService;

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
}

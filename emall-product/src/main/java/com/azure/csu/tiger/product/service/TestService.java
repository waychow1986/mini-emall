package com.azure.csu.tiger.product.service;

import com.azure.csu.tiger.grpc.lib.HelloReply;
import com.azure.csu.tiger.grpc.lib.HelloRequest;
import com.azure.csu.tiger.grpc.lib.SimpleGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class TestService extends SimpleGrpc.SimpleImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello Product========== " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
//        super.sayHello(request, responseObserver);
    }
}

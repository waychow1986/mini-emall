package com.azure.csu.tiger.web.controller;

import com.azure.csu.tiger.grpc.lib.HelloReply;
import com.azure.csu.tiger.grpc.lib.HelloRequest;
import com.azure.csu.tiger.grpc.lib.SimpleGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.concurrent.ExecutionException;

@ApiIgnore
@RefreshScope
@RestController
public class TestController {

    @GrpcClient("emall-order")
    private SimpleGrpc.SimpleBlockingStub orderStub;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Value("${spring.redis.port}")
    private String port;

    @Value("${eric.zhou}")
    private String eric;

    @RequestMapping("/config/get")
    public String configTest() {
        return eric;
    }

    @RequestMapping("/echo")
    public String echo(@RequestParam(required = false) String keyword) {
        String result = StringUtils.hasText(keyword) ? keyword : "Hello";
        return result + " from Azure Spring Apps!";
    }

    @RequestMapping("/redis/put")
    public String redisPut(@RequestParam(required = false) String keyword, @RequestParam(required = false) String value) {
        redisTemplate.opsForValue().set(keyword, value);
        return "success";
    }

    @RequestMapping("/redis/get")
    public String redisGet(@RequestParam(required = false) String keyword) {
        String value = redisTemplate.opsForValue().get(keyword);
        return value;
    }

    @RequestMapping("/grpc/get")
    public String grpcGet(@RequestParam(required = false) String name) throws ExecutionException, InterruptedException {
        HelloReply productReply = orderStub.sayHello(HelloRequest.newBuilder().setName(name).build());
        StringBuilder builder = new StringBuilder();
        return builder.append(productReply.getMessage()).toString();
    }
}

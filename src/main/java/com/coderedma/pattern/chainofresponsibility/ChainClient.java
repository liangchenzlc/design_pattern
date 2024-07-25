package com.coderedma.pattern.chainofresponsibility;

/**
 * @Author coderedma
 * @Desc 责任链客户端
 * @createTime 2024/7/25 15:41
 * @since 1.0.0
 * 责任链模式 是一种常用的设计模式，它定义了请求和接收者之间的一对多关系，让多个接收者处理请求，
 */
public class ChainClient {
    public static void main(String[] args) {
        RequestChain requestChain = new RequestChain();
        requestChain.addHandler(new GetRequestHandler());
        requestChain.addHandler(new PostRequestHandler());
        requestChain.handleRequest("GET", requestChain);
        requestChain.handleRequest("POST", requestChain);
        requestChain.handleRequest("PUT", requestChain);
    }
}

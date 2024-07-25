package com.coderedma.pattern.chainofresponsibility;

/**
 * @Author coderedma
 * @Desc 处理Post请求的处理器
 * @createTime 2024/7/25 15:39
 * @since 1.0.0
 */
public class PostRequestHandler implements Handler{
    @Override
    public void handleRequest(String request, RequestChain requestChain) {
        if ("POST".equals(request)) {
            System.out.println("处理POST请求");
            return;
        }else {
            requestChain.handleRequest(request, requestChain);
        }
    }
}

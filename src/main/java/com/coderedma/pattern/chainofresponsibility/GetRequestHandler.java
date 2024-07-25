package com.coderedma.pattern.chainofresponsibility;

/**
 * @Author coderedma
 * @Desc 处理Get请求的处理器
 * @createTime 2024/7/25 15:38
 * @since 1.0.0
 */
public class GetRequestHandler implements Handler{
    @Override
    public void handleRequest(String request, RequestChain requestChain) {
        if ("GET".equals(request)) {
            System.out.println("处理GET请求");
            return;
        }else {
            requestChain.handleRequest(request,requestChain);
        }
    }
}

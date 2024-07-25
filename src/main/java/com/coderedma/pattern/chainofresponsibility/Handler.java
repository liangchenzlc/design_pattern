package com.coderedma.pattern.chainofresponsibility;

/**
 * @Author coderedma
 * @Desc 处理器接口
 * @createTime 2024/7/25 15:28
 * @since 1.0.0
 */
public interface Handler {
    void handleRequest(String request, RequestChain requestChain);
}

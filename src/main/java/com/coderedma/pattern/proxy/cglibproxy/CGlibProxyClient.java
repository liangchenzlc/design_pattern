package com.coderedma.pattern.proxy.cglibproxy;

/**
 * @Author coderedma
 * @Desc cglib动态代理的客户端
 * @createTime 2024/7/25 11:29
 * @since 1.0.0
 *
 * jdk8 以上版本不允许直接使用defineClass()
 */
public class CGlibProxyClient {
    public static void main(String[] args) {
        Server server = ServerProxy.getInstance();
        server.visit();
    }
}

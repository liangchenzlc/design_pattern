package com.coderedma.pattern.proxy.jdkproxy;

/**
 * @Author coderedma
 * @Desc jdk用接口增强实现的客户端
 * @createTime 2024/7/25 11:18
 * @since 1.0.0
 */
public class JDKProxyClient {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse instance = BuyHouseProxy.getInstance(buyHouse);
        instance.buyHouse();
        instance.calculateHouse();
    }
}

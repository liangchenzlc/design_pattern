package com.coderedma.pattern.proxy.staticproxy;

/**
 * @Author coderedma
 * @Desc 静态代理的客户端
 * @createTime 2024/7/25 11:08
 * @since 1.0.0
 * 缺点 代理对象与目标对象要实现相同的接口，
 * 我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改
 */
public class StaticProxyClient {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
    }
}

package com.coderedma.pattern.proxy.staticproxy;

/**
 * @Author coderedma
 * @Desc 代理对象
 * @createTime 2024/7/25 11:07
 * @since 1.0.0
 */
public class ProxyImage implements Image{

    private RealImage realImage;

    public ProxyImage(String fileName) {
        realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        System.out.println("图片展示前");
        realImage.display();
        System.out.println("图片展示后");
    }
}

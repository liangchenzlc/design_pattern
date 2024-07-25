package com.coderedma.pattern.proxy.staticproxy;

/**
 * @Author coderedma
 * @Desc 真实委托的图片对象
 * @createTime 2024/7/25 11:06
 * @since 1.0.0
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }
}

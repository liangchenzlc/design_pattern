package com.coderedma.pattern.adapter;

/**
 * @Author coderedma
 * @Desc 适配器客户端
 * @createTime 2024/7/25 10:21
 * @since 1.0.0
 * 适配器模式
 */
public class AdapterClient {
    public static void main(String[] args) {
        // 创建计算机
        Computer computer = new Computer();
        // 当前我只有usb的接口，但是我的电脑需要typeC的接口
        USB usb = new USBImpl();
        // 用适配器来转换
        TypeCAdapter typeCAdapter = new TypeCAdapter(usb);
        // 读取数据
        computer.readData(typeCAdapter);
    }
}

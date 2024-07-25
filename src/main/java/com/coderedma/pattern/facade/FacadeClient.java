package com.coderedma.pattern.facade;

/**
 * @Author coderedma
 * @Desc 外观模式客户端
 * @createTime 2024/7/25 17:06
 * @since 1.0.0
 * 外观模式
 */
public class FacadeClient {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}

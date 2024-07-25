package com.coderedma.pattern.builder;

/**
 * @Author coderedma
 * @Desc 建造者模式的客户端
 * @createTime 2024/7/25 9:54
 * @since 1.0.0
 */
public class BuilderClient {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer computer = computerBuilder
                .cpu("i7-14700kf")
                .memory("三星32G")
                .disk("GM700 1T")
                .mainBoard("华硕Z790-A")
                .power("海韵 750W")
                .build();
        computer.showDetail();
    }
}

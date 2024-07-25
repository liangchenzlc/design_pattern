package com.coderedma.pattern.builder;

/**
 * @Author coderedma
 * @Desc 电脑建造者
 * @createTime 2024/7/25 9:48
 * @since 1.0.0
 * 建造者模式
 */
public class ComputerBuilder {
    private String cpu;  // cpu
    private String memory; // 内存
    private String disk; // 硬盘
    private String mainBoard; // 主板
    private String power; // 电源

    public ComputerBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public ComputerBuilder memory(String memory) {
        this.memory = memory;
        return this;
    }
    public ComputerBuilder disk(String disk) {
        this.disk = disk;
        return this;
    }
    public ComputerBuilder mainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
        return this;
    }
    public ComputerBuilder power(String power) {
        this.power = power;
        return this;
    }
    public Computer build() {
        return new Computer(cpu, memory, disk, mainBoard, power);
    }
}

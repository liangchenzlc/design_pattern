package com.coderedma.pattern.builder;

/**
 * @Author coderedma
 * @Desc 电脑产品
 * @createTime 2024/7/25 9:44
 * @since 1.0.0
 */
public class Computer {
    private String cpu;  // cpu
    private String memory; // 内存
    private String disk; // 硬盘
    private String mainBoard; // 主板
    private String power; // 电源

    public Computer(String cpu, String memory, String disk, String mainBoard, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
        this.mainBoard = mainBoard;
        this.power = power;
    }

    public void showDetail() {
        System.out.println("cpu:" + cpu);
        System.out.println("memory:" + memory);
        System.out.println("disk:" + disk);
        System.out.println("mainBoard:" + mainBoard);
        System.out.println("power:" + power);
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}

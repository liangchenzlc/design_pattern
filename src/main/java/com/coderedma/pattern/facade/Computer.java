package com.coderedma.pattern.facade;

/**
 * @Author coderedma
 * @Desc 门面类电脑
 * @createTime 2024/7/25 17:06
 * @since 1.0.0
 */
public class Computer {
    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer()
    {
        this.cpu = new Cpu();
        this.memory = new Memory();
        this.disk = new Disk();
    }
    public void startup()
    {
        System.out.println("startup computer");
        cpu.start();
        memory.start();
        disk.startup();
    }
    public void shutdown()
    {
        System.out.println("shutdown computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }
}

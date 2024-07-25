package com.coderedma.pattern.command;

/**
 * @Author coderedma
 * @Desc 打开电灯的命令类
 * @createTime 2024/7/25 15:50
 * @since 1.0.0
 */
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}

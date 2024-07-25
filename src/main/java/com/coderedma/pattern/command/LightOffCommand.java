package com.coderedma.pattern.command;

/**
 * @Author coderedma
 * @Desc 关灯的命令类
 * @createTime 2024/7/25 15:51
 * @since 1.0.0
 */
public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}

package com.coderedma.pattern.command;

import java.rmi.Remote;

/**
 * @Author coderedma
 * @Desc 命令模式的客户端
 * @createTime 2024/7/25 15:52
 * @since 1.0.0
 * 命令模式
 */
public class CommandClient {
    public static void main(String[] args) {
        // 命令接收方
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // 命令的调用方
        Person person = new Person();
        // 调用方发送命令
        person.sendCommand(lightOn);
        person.sendCommand(lightOff);

    }
}

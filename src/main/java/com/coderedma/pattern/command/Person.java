package com.coderedma.pattern.command;

/**
 * @Author coderedma
 * @Desc 命令调用者
 * @createTime 2024/7/25 15:59
 * @since 1.0.0
 */
public class Person {

    public void sendCommand(Command command)
    {
        command.execute();
    }

}

package com.coderedma.pattern.mediator;

/**
 * @Author coderedma
 * @Desc 用户类
 * @createTime 2024/7/25 16:36
 * @since 1.0.0
 */
public class User implements Participant{

    private String name;

    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.mediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + "收到信息：" + message);
    }

    @Override
    public String getName() {
        return name;
    }
}

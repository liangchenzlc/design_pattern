package com.coderedma.pattern.mediator;

/**
 * @Author coderedma
 * @Desc 中介者接口
 * @createTime 2024/7/25 16:33
 * @since 1.0.0
 */
public interface Mediator {
    void sendMessage(String message, Participant participant);

    void addUser(Participant participant);
}

package com.coderedma.pattern.mediator;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author coderedma
 * @Desc 聊天室
 * @createTime 2024/7/25 16:35
 * @since 1.0.0
 */
public class ChatRoom implements Mediator{
    // 维护一个用户在线列表
    private List<Participant> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, Participant participant) {
        System.out.println(participant.getName() + "发送消息: " + message);

        for (Participant user : users) {
            if (!user.getName().equals(participant.getName())) {
                user.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(Participant participant) {
        users.add(participant);
    }
}

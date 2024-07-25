package com.coderedma.pattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author coderedma
 * @Desc 请求的链路
 * @createTime 2024/7/25 15:29
 * @since 1.0.0
 */
public class RequestChain {

    // 存放Handler
    private List<Handler> handlers = new ArrayList<>();

    // 记录当前处理器的位置
    private int index = 0;

    public void addHandler(Handler handler)
    {
        handlers.add(handler);
    }

    public void handleRequest(String request, RequestChain requestChain) {
        if (index < handlers.size()) {
            Handler handler = handlers.get(index);
            index++;
            handler.handleRequest(request, requestChain);
        }else {
            System.out.println("找不到匹配的请求");
        }
    }
}

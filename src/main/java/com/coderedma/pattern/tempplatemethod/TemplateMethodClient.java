package com.coderedma.pattern.tempplatemethod;

/**
 * @Author coderedma
 * @Desc 模板方法的客户端
 * @createTime 2024/7/25 14:40
 * @since 1.0.0
 * 模板方法模式
 */
public class TemplateMethodClient {
    public static void main(String[] args) {
        Worker worker = new ITWorker("coderedma");
        worker.workOneDay();
    }
}

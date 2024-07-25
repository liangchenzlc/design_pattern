package com.coderedma.pattern.tempplatemethod;

import javafx.concurrent.Worker;

/**
 * @Author coderedma
 * @Desc it打工人
 * @createTime 2024/7/25 14:38
 * @since 1.0.0
 * 具体实现的抽象模板的类
 */
public class ITWorker extends AbstractWorker {

    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("工作码字的一天 % ^ %");
    }
}

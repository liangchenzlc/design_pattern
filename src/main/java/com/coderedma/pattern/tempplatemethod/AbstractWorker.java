package com.coderedma.pattern.tempplatemethod;

import java.util.Date;

/**
 * @Author coderedma
 * @Desc 抽象的模板
 * @createTime 2024/7/25 14:33
 * @since 1.0.0
 */
public abstract class AbstractWorker implements Worker {
    protected String name;

    public AbstractWorker(String name) {
        this.name = name;
    }

    // 用final是让子类不能重写
    @Override
    public final void workOneDay() {
        enterCompany();
        openComputer();
        work();
        closeComputer();
        leaveCompany();
    }

    public boolean isNeedPrintDateHook() {
        return false;
    }

    public final void enterCompany() {
        System.out.println(name + "进入公司");
    }

    public final void openComputer() {
        System.out.println(name + "打开电脑");
    }

    public final void closeComputer() {
        System.out.println(name + "关闭电脑");
    }

    public final void leaveCompany() {
        if (this.isNeedPrintDateHook()) {
            System.out.println("--------" + new Date().toString() + "-----------");
        }
        System.out.println(name + "离开公司");
    }

    public abstract void work();

}

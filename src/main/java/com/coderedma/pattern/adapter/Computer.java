package com.coderedma.pattern.adapter;

import javax.sound.sampled.EnumControl;

/**
 * @Author coderedma
 * @Desc 电脑
 * @createTime 2024/7/25 10:11
 * @since 1.0.0
 */
public class Computer {

    public void readData(TypeC typeC)
    {
        System.out.println("读取数据：" + typeC.provideTypeCData());
    }
}

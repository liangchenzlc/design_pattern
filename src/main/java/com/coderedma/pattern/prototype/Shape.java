package com.coderedma.pattern.prototype;

/**
 * @Author coderedma
 * @Desc 原型形状接口
 * @createTime 2024/7/25 10:00
 * @since 1.0.0
 */
public interface Shape {
    void draw();

    Shape clone();
}

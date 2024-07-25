package com.coderedma.pattern.interpreter;

/**
 * @Author coderedma
 * @Desc 表达式接口
 * @createTime 2024/7/25 17:18
 * @since 1.0.0
 */
public interface Expression {
    public boolean interpreter(String context);
}

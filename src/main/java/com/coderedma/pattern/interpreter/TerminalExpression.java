package com.coderedma.pattern.interpreter;

/**
 * @Author coderedma
 * @Desc
 * @createTime 2024/7/25 17:19
 * @since 1.0.0
 */
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String context) {
        return data.contains(context);
    }
}

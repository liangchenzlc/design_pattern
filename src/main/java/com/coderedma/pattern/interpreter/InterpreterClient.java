package com.coderedma.pattern.interpreter;

/**
 * @Author coderedma
 * @Desc 解释器模式客户端
 * @createTime 2024/7/25 17:22
 * @since 1.0.0
 * 解释器模式
 */
public class InterpreterClient {
    public static void main(String[] args) {
        Expression expression = new TerminalExpression("abc");
        System.out.println(expression.interpreter("abc"));

        // 实际上相当于 (abc.contains(abc) && abcabc.contains(abc))
        expression = new AndExpression(new TerminalExpression("abc"), new TerminalExpression("abcabc"));
        System.out.println(expression.interpreter("abc"));

        expression = new OrExpression(new TerminalExpression("abc"), new TerminalExpression("abcabc"));
        System.out.println(expression.interpreter("abc"));
    }
}

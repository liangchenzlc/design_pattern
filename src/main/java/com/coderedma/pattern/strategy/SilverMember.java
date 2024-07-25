package com.coderedma.pattern.strategy;

/**
 * @Author coderedma
 * @Desc 白银会员
 * @createTime 2024/7/25 14:23
 * @since 1.0.0
 */
public class SilverMember implements Member{
    @Override
    public float discount(float price) {
        return (float) (0.8 * price);
    }
}

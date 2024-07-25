package com.coderedma.pattern.strategy;

/**
 * @Author coderedma
 * @Desc 普通会员
 * @createTime 2024/7/25 14:22
 * @since 1.0.0
 */
public class OrdinaryMember implements Member{
    @Override
    public float discount(float price) {
        return (float) (0.9 * price);
    }
}

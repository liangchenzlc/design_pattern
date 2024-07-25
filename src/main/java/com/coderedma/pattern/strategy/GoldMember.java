package com.coderedma.pattern.strategy;

/**
 * @Author coderedma
 * @Desc 黄金会员
 * @createTime 2024/7/25 14:24
 * @since 1.0.0
 */
public class GoldMember implements Member{
    @Override
    public float discount(float price) {
        return (float) (0.75 * price);
    }
}

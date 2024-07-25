package com.coderedma.pattern.strategy;

/**
 * @Author coderedma
 * @Desc 会员身份
 * @createTime 2024/7/25 14:21
 * @since 1.0.0
 */
public interface Member {
    // 折扣
    float discount(float price);
}

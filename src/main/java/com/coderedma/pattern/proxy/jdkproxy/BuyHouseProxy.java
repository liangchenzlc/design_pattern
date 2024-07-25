package com.coderedma.pattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author coderedma
 * @Desc 动态代理类
 * @createTime 2024/7/25 11:13
 * @since 1.0.0
 */
public class BuyHouseProxy {
    public static BuyHouse getInstance(BuyHouse buyHouse) {
        Object result = Proxy.newProxyInstance(buyHouse.getClass().getClassLoader(),
                buyHouse.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("接口方法增强前");
                        Object result = method.invoke(buyHouse, args);
                        System.out.println("接口方法增强后");
                        return result;
                    }
                });

        return (BuyHouse) result;
    }
}

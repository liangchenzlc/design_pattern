package com.coderedma.pattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author coderedma
 * @Desc cglib的动态代理类
 * @createTime 2024/7/25 11:25
 * @since 1.0.0
 */
public class ServerProxy {
    public static Server getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Server.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("进入服务器前记录日志");
                Object result = methodProxy.invokeSuper(o, objects);
                System.out.println("进入服务器后记录日志");
                return result;
            }
        });

        Object o = enhancer.create();
        return (Server) o;
    }
}

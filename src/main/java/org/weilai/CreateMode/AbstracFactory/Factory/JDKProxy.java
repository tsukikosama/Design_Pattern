package org.weilai.CreateMode.AbstracFactory.Factory;

import org.weilai.CreateMode.AbstracFactory.Adapter.Impl.ICacheAdapter;
import org.weilai.CreateMode.AbstracFactory.JDKInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKProxy  {

    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter
            cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader =
                Thread.currentThread().getContextClassLoader();


        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]},
                handler);
    }
}

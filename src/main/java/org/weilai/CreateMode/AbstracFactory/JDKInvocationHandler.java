package org.weilai.CreateMode.AbstracFactory;


import org.weilai.CreateMode.AbstracFactory.Adapter.Impl.ICacheAdapter;
import org.weilai.CreateMode.AbstracFactory.utils.ClassLoaderUtils;

//import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public JDKInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }

}

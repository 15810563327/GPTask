package gupao.edu.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Job51 implements InvocationHandler {

    private Object target;

    public Object getInstance(Object job){
        this.target = job;
        Class<?> clazz = this.target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        PostProcess.before();

        Object obj = method.invoke(target,args);

        PostProcess.after();

        return obj;
    }


}

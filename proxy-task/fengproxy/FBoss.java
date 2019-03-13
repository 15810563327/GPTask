package gupao.edu.proxy.fengproxy;

import gupao.edu.proxy.jdkproxy.PostProcess;

import java.lang.reflect.Method;

/**
 * 代理人
 */
public class FBoss implements FInvocationHandler{


    private Object object;

    public Object getInstance(Object obj){
        this.object = obj;
        Class<?> clazz = object.getClass();
        return FProxy.newFProxyInstance(new FClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        FPostProcess.before();

        Object obj =  method.invoke(object);

        FPostProcess.after();

        return obj;
    }
}

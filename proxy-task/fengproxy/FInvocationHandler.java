package gupao.edu.proxy.fengproxy;


import java.lang.reflect.Method;

/**
 *
 * jdk 实现动态代理，需要一个InvocationHandler接口
 */
public interface FInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;

}

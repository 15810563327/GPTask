package gupao.edu.proxy.fengproxy;

import gupao.edu.proxy.jdkproxy.Job51;
import gupao.edu.proxy.jdkproxy.Programmer;

import java.lang.reflect.Method;

public class QFProxyTest {

    public static void main(String[] args) {
        try {
            FBoss boss = new FBoss();
            Object obj = boss.getInstance(new FProgrammer());
            Method method = obj.getClass().getMethod("findJob",null);
            method.invoke(obj);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

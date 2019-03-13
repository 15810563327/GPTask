package gupao.edu.proxy.jdkproxy;

import java.lang.reflect.Method;

public class QJDKProxyTest {

    public static void main(String[] args) {
        try {
            Job51 job51 = new Job51();
            Object obj = job51.getInstance(new Programmer());
            Method method = obj.getClass().getMethod("findJob",null);
            method.invoke(obj);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

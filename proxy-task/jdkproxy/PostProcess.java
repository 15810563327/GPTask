package gupao.edu.proxy.jdkproxy;

public class PostProcess {

    public static Object before(){
        System.out.println("51Job要找这样的工作");
        System.out.println("-----------------");
        return null;
    }

    public static Object after(){
        System.out.println("-----------------");
        System.out.println("就你了");
        return null;
    }
}

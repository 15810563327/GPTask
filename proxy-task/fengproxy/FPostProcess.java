package gupao.edu.proxy.fengproxy;

public class FPostProcess {

    public static Object before(){
        System.out.println("BOSS直聘要找这样的工作");
        System.out.println("-----------------");
        return null;
    }

    public static Object after(){
        System.out.println("-----------------");
        System.out.println("就你了");
        return null;
    }
}

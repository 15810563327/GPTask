package com.gupaoedu.vip.pattern.template;

public class WordTemplate{


    public void word26(String c){
        this.a();
        this.b();
        this.addMethod(c);
        this.d();
    }
    private void a(){
        System.out.println("a");
    }
    private void b(){
        System.out.println("b");
    }
    public void addMethod(String c){
        System.out.println(c);

    }
    private void d(){
        System.out.println("d");
    }

}

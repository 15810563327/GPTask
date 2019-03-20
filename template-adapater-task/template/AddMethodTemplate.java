package com.gupaoedu.vip.pattern.template;

public class AddMethodTemplate {

    private WordTemplate template;

    public AddMethodTemplate(WordTemplate template) {
        this.template = template;
    }

    public void abcd(String c){
       this.template.word26(c);
    }
}

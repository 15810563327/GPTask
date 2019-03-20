package com.gupaoedu.vip.pattern.template;

public class WTemplateTest {

    public static void main(String[] args) {
        AddMethodTemplate template = new AddMethodTemplate(new WordTemplate());
        template.abcd("z");
    }

}

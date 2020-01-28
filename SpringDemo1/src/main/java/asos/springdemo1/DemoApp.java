/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.springdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vsa
 */
public class DemoApp {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext(new String[]{"beans.xml"});

        MessageProcessor mp = context.getBean("processor", MessageProcessor.class);
        mp.processMessage();
        mp.processMessage();
        mp.processMessage();
        
        MyAspectBean asb = context.getBean("logBean", MyAspectBean.class);
        System.out.println(asb.getCount());
        System.out.println(asb.totalCharCount());
    }
}

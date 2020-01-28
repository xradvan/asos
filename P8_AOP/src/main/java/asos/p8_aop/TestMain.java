/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p8_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author vsa
 */
public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyOperationBean bean = (MyOperationBean) context.getBean("opBean");
        System.out.println("calling m...");
        bean.m();
        System.out.println("calling k...");
        bean.k();
        System.out.println("calling msg...");
        bean.msg("hello");
    }
}

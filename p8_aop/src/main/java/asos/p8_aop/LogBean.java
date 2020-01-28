/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p8_aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author vsa
 */
public class LogBean {
    
    public void log(ProceedingJoinPoint call, String msg) throws Throwable {
        System.out.println("log: " + msg);
        System.out.println("log: " + call.proceed().toString());
    }
}

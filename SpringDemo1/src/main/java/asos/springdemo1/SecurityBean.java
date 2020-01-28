/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.springdemo1;

import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author vsa
 */
public class SecurityBean {
    private int key = 3;
    
    public String enc(ProceedingJoinPoint jp) throws Throwable {
        String ct = "";
        String pt = jp.proceed().toString();
        for (char c : pt.toCharArray()) {
            System.out.print( c + " ");
            ct.concat(String(c + key));
        }
        return "enc";
    }
    
    public Object dec(ProceedingJoinPoint jp, String x) throws Throwable {
        System.out.println("dec: ");
        System.out.println(x);
        return jp.proceed();
    }
            
}

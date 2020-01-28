/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.springdemo1;

import org.aspectj.lang.JoinPoint;

/**
 *
 * @author vsa
 */
public class MyAspectBean {
    private int count = 0;
    private int charCount = 0;
    
    public void log(JoinPoint jp) {
        System.out.println("log " + jp.getSignature());
    }
    
    public void callCount(JoinPoint jp) {
        count++;
    }

    public void doCharCount(JoinPoint jp, Object result) {
        charCount += result.toString().length();
    }
    
    public int getCount() {
        return count;
    }
    
    public int totalCharCount() {
        return charCount;
    }
}

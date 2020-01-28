/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p8_2;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author vsa
 */
public class SecBean {
    private int key = 0;

    public void setKey(int key) {
        this.key = key;
    }
    
    public String enc(ProceedingJoinPoint call) throws Throwable {
        String ot = call.proceed().toString();
        String ct = "";
        for (int i = 0; i < ot.length(); i++) {
            char c = ot.charAt(i);
            ct += (char) (((int) c + key ) % 27);
        }
        return ct;
    }
    
    public Object dec(ProceedingJoinPoint call, String x) throws Throwable {
        String ot = "";
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            ot += (char) (c - key);
        }
        
        Object[] par = {ot};
        return call.proceed(par);
    }
    
}

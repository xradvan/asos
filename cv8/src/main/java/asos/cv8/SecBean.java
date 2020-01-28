/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.cv8;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 * @author vsa
 */
public class SecBean {

    private int key = 0;

    public SecBean() {
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String enc(ProceedingJoinPoint call) throws Throwable {
        String x = call.proceed().toString();
        String ct = "";
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            c = (char) ((char) (c + key));

            ct += c;
        }
        System.out.println("enc: " + ct);
        return ct;
    }

    public Object dec(ProceedingJoinPoint call, String x) throws Throwable {
        String ot = "";
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            c = (char) ((char) (c - key));

            ot += c;
        }
        Object[] par = {ot};
        System.out.println("dec: " + ot);
        return call.proceed(par);
    }

}

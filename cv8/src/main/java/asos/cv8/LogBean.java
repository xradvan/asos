/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.cv8;

import org.aspectj.lang.JoinPoint;

/**
 *
 * @author vsa
 */
public class LogBean {
    private int gmCount = 0;
    private int retLen = 0;

    public LogBean() {
    }
    
    public int getGmCount() {
        return gmCount;
    }

    public int getRetLen() {
        return retLen;
    }
    
    public void log(JoinPoint jp) {
        System.out.println("log: " + jp.getSignature());
    }
    
    public void log2() {
        gmCount++;
    }
    
    public void log3(String retVal) {
        retLen += retVal.length();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.aop1;

import org.aspectj.lang.JoinPoint;

/**
 *
 * @author vsa
 */
public class Logger {
    public void log(int x) {
        System.out.println("logging: " + x);
    }
}

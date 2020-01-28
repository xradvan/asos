/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p8_aop;

/**
 *
 * @author vsa
 */
public class SimpleBean {

    public SimpleBean() {
    }
    
    
    public String doSomething(String todo) {
        System.out.println(todo);
        return "!!! " + todo + "!!";
    }
    
}

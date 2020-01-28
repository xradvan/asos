/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p8_javabased;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author vsa
 */
public class MessageProcessor {
    
    @Autowired
    private MessageServiceIfc service;

    public MessageProcessor(MessageServiceIfc service) {
        this.service = service;
    }

    public String process() {
        String msg = service.getMessage();
        return msg;
    }
}

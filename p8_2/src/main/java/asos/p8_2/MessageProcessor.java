/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p8_2;

/**
 *
 * @author vsa
 */
public class MessageProcessor {
    private MessageServiceIfc service;
    private MessageConsumerIfc consumer;

    public MessageProcessor(MessageServiceIfc service, MessageConsumerIfc consumer) {
        this.service = service;
        this.consumer = consumer;
    }
    
    public void process() {
        String msg = service.getMessage();
        consumer.putMessage(msg);
    }
}

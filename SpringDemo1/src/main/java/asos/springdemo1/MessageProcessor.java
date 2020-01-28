/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.springdemo1;

/**
 *
 * @author vsa
 */
public class MessageProcessor {
    private MessageServiceIfc service;
    private MessageConsumerIfc consumer;

    public MessageProcessor(MessageServiceIfc messageService, MessageConsumerIfc messageConsumer) {
        this.service = messageService;
        this.consumer = messageConsumer;
    }
    
    public void processMessage() {
        consumer.putMessage(service.getMessage());
    }
}

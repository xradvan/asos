/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p7;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author vsa
 */
public class MessageProcessor {
    private MessageServiceIfc msgService;

    @Autowired
    public MessageProcessor(MessageServiceIfc msgService) {
        this.msgService = msgService;
    }

    public void setMsgService(MessageServiceIfc msgService) {
        this.msgService = msgService;
    }

    public String processMessage() {
        String msg = msgService.getMessage();
        return msg;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asos.p8_javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author vsa
 */
@Configuration
public class DemoAppConfig {
    
    @Bean(name="service")
    public MessageServiceIfc serviceFactory() {
        return new MessageServiceMock();
    }
    
    @Bean(name="processor")
    public MessageProcessor processorFactory(MessageServiceIfc ms) {
        return new MessageProcessor(ms);
    }
}

package com.ericsson.cep.jms;


import org.springframework.jms.core.JmsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import javax.jms.*;
import org.springframework.jms.core.MessageCreator;


/**
 * Created by onty on 05/06/2016.
 */
public class QueueProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessages() throws JMSException{
        jmsTemplate.send(new MessageCreator(){

            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage message  = session.createTextMessage("test message from spring");
                message.setStringProperty("text", "Hello World");
                return message;
            }
        });
    }

    public void receiveMessages() throws JMSException{
        System.out.println("Getting message from queue "+ jmsTemplate.receive().getStringProperty("text"));
    }
}

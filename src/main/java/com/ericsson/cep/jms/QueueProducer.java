package com.ericsson.cep.jms;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;


/**
 * Created by onty on 05/06/2016.
 */
public class QueueProducer {
    static Logger log = Logger.getLogger(QueueProducer.class.getName());

    public void setContent(String content) {
        this.content = content;
    }

    private String content;


    @Autowired
    private JmsTemplate jmsTemplate;

    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessages() throws JMSException{
        jmsTemplate.send(new MessageCreator(){

            @Override
            public Message createMessage(Session session) throws JMSException {
                log.info("sending message now..");
                TextMessage message  = session.createTextMessage(content);
                message.setStringProperty("isi", "Hello World");
                return message;
            }
        });
    }

}

package com.ericsson.cep.ws;


import org.apache.log4j.Logger;
import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Created by onty on 06/06/2016.
 */
public class WSCaller implements SessionAwareMessageListener{
    static Logger log = Logger.getLogger(WSCaller.class.getName());

    public void onMessage(Message message, Session session) throws JMSException {

        TextMessage msg = (TextMessage) message;
        log.info("++message received : " + msg.getText());
        log.info("++property received : " +msg.getStringProperty("isi"));
    }
}

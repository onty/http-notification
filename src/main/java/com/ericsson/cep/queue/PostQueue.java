package com.ericsson.cep.queue;

import com.ericsson.cep.jms.QueueProducer;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.apache.log4j.Logger;
import com.ericsson.cep.data.NotificationData;

import javax.jms.JMSException;

public class PostQueue {
        static Logger log = Logger.getLogger(PostQueue.class.getName());

        @Autowired
        QueueProducer producer;


        @RequestMapping(value = "/EmailQueue", method = RequestMethod.GET)
        public ModelAndView student() {
            return new ModelAndView("student", "command", new NotificationData());
        }

        @RequestMapping(value = "/EmailQueue", method = RequestMethod.POST)
        public String emailQueue(@ModelAttribute("SpringWeb") NotificationData data,
                                 ModelMap model) {
            log.info("Queue added from "+data.getMsisdn());

            producer.setMessage(data.getMessage());
            try {
                producer.sendMessages();
            }catch(JMSException e) {
                log.error(e.getMessage());
            }
            return "result";
        }
}

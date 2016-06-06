package com.ericsson.cep.handler;

import com.ericsson.cep.data.NotificationData;
import com.ericsson.cep.jms.QueueProducer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.JMSException;

@Controller
public class PostQueue {
        static Logger log = Logger.getLogger(PostQueue.class.getName());

        @Autowired
        QueueProducer producer;


        @RequestMapping(value = "/EmailQueue", method = RequestMethod.GET)
        public ModelAndView student() {
            return new ModelAndView("send", "command", new NotificationData());
        }
/*
        @RequestMapping(value = "/EmailQueue", method = RequestMethod.POST)
        public String emailQueue(@ModelAttribute("data") NotificationData data,
                                 ModelMap model) {
            log.info("Queue added from "+data.getMsisdn());
            model.addAttribute("msisdn", data.getMsisdn());
            model.addAttribute("email", data.getEmailAddress());
            model.addAttribute("message", data.getMessage());

            try {
                producer.sendMessages();
            }catch(JMSException e) {
                log.error(e.getMessage());
            }
            return "result";
        }
*/


    @RequestMapping(value = "/EmailQueue", method = RequestMethod.POST, headers = "Content-Type=text/plain")
    public String emailQueue(@RequestBody String payload) {
        log.info("Queue added containing "+payload);
        producer.setContent(payload);

        try {
            producer.sendMessages();
        }catch(JMSException e) {
            log.error(e.getMessage());
        }
        return "result";
    }
}

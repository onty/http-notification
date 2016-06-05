package com.ericsson.cep.queue;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.apache.log4j.Logger;
import com.ericsson.cep.data.NotificationData;

public class PostQueue {
    static Logger log = Logger.getLogger(PostQueue.class.getName());

        @RequestMapping(value = "/EmailQueue", method = RequestMethod.GET)
        public ModelAndView student() {
            return new ModelAndView("student", "command", new NotificationData());
        }

        @RequestMapping(value = "/EmailQueue", method = RequestMethod.POST)
        public String emailQueue(@ModelAttribute("SpringWeb") NotificationData data,
                                 ModelMap model) {

            model.addAttribute("name", data.getEmailAddress());
            model.addAttribute("age", data.getMsisdn());
            model.addAttribute("id", data.getMessage());

            return "result";
        }
}

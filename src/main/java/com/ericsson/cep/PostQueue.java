package com.ericsson.cep;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import org.apache.log4j.Logger;

/**
 * Created by onty on 04/06/2016.
 */
@Controller
public class PostQueue {
    static Logger log = Logger.getLogger(PostQueue.class.getName());

        @RequestMapping(value = "/student", method = RequestMethod.GET)
        public ModelAndView student() {
            return new ModelAndView("student", "command", new Student());
        }

        @RequestMapping(value = "/EmailQueue", method = RequestMethod.POST)
        public String emailQueue(@ModelAttribute("SpringWeb")Student student,
                                 ModelMap model) {

            model.addAttribute("name", student.getName());
            model.addAttribute("age", student.getAge());
            model.addAttribute("id", student.getId());

            return "result";
        }
}

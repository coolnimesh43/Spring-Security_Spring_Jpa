package org.nimesh.spring_security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/error")
public class ErrorController {

    @RequestMapping(value = "/invalidaccess", method = RequestMethod.GET)
    public ModelAndView handleInvalidRequest() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error/invalid-access");
        return modelAndView;
    }
}

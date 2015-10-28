package org.nimesh.spring_security.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nimesh.spring_security.model.AppUser;
import org.nimesh.spring_security.services.AuthService;
import org.nimesh.spring_security.util.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/login")
public class AuthController {
    private static final Logger LOG = LogManager.getLogger(AuthController.class);

    @Autowired
    private AuthService authService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getLoginPage() {
        LOG.info("Inside AuthController#getLoginPage method.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(AppConstant.LOGIN_PAGE);
        return modelAndView;
    }

    @RequestMapping(value = "/authfailed", method = RequestMethod.GET)
    public ModelAndView loginFailed() {
        LOG.info("Inside AuthController#loginFailed method.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(AppConstant.LOGIN_PAGE);
        modelAndView.addObject(AppConstant.AUTHORIZATION_FAILED, Boolean.TRUE);
        return modelAndView;
    }

    @RequestMapping(value = "/forgot", method = RequestMethod.GET)
    public ModelAndView getForgotPasswordPage() {
        LOG.info("Inside AuthController#getForgotPasswordPage method.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(AppConstant.FORGOT_PASSWORD_PAGE);
        return modelAndView;
    }

    @RequestMapping(value = "/forgot", method = RequestMethod.POST)
    public ModelAndView forgotPassword(@ModelAttribute("appUser") AppUser appUser) {
        LOG.info("Inside AuthController#forgotPassword method.");
        Boolean isEmailValid = appUser != null ? authService.validateUserEmail(appUser.getEmail()) : Boolean.FALSE;
        LOG.info("Is email address valid? {}", isEmailValid);
        ModelAndView modelAndView = new ModelAndView();
        String viewPage = isEmailValid ? AppConstant.RESET_LINK_SENT_PAGE : AppConstant.FORGOT_PASSWORD_PAGE;
        if (!isEmailValid) {
            modelAndView.addObject(AppConstant.INVALID_EMAIL_ADDRESS, !isEmailValid);
        } else {
            // TODO: Add logic to set and send the reset link.
        }
        modelAndView.setViewName(viewPage);
        return modelAndView;
    }

}

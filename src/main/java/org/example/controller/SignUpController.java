package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUpController {

    @RequestMapping(value="/signup", method = RequestMethod.GET)
    public String signup(){
        return "signup";
    }
}

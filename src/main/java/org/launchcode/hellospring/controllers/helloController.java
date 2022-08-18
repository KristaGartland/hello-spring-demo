package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
     // put /hello to show the message
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring";
    }
   // put /goodbye to show the message
    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring";
    }

}

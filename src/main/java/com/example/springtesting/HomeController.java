package com.example.springtesting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public @ResponseBody String greeting(){
        return "Hello, World";
    }
}

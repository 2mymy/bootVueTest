package com.yystd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String TEST() {
        System.out.println("TEST");
        return "tt";
    }

}
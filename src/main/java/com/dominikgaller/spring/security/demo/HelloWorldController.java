package com.dominikgaller.spring.security.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String cheers() {
        return "Cheers";
    }

    @RequestMapping("/deadPoetsSociety")
    public String ahoi() {
        return "Captain, my captain!";
    }

}

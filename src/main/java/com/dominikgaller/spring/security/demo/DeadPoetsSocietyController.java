package com.dominikgaller.spring.security.demo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("deadPoetsSociety")
public class DeadPoetsSocietyController {

    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    @RequestMapping("/captain")
    public String captainMyCaptain() {
        return "Captain, my captain!";
    }

}

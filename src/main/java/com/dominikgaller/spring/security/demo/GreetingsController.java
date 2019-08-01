package com.dominikgaller.spring.security.demo;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.DenyAll;

@DenyAll()
@RestController
@RequestMapping("greetings")
public class GreetingsController {

    @RequestMapping("gutenTag")
    public String gutenTag() {
        return "gutenTag";
    }


    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    @RequestMapping("cheers")
    public String cheers() {
        return "Cheers";
    }

}

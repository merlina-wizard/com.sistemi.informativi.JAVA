package com.sistemi.informativi.controller;


import com.sistemi.informativi.bean.MessageBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public MessageBean welcome() {
        return new MessageBean("bean");
    }
}

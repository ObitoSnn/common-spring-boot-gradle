package com.obitosnn.controller;

import com.obitosnn.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ObitoSnn
 */
@RestController
public class DemoController {

    @Autowired
    private User user;

    @GetMapping("/demo")
    public User user() {
        return user;
    }

}

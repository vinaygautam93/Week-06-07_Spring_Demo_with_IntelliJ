package com.bridgeLabz.controller;

import com.bridgeLabz.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        // UC2: Create a message object and pass it to the view
        Message message = new Message("Hello from BridgeLabz");
        model.addAttribute("message", message);
        return "hello"; // Render hello.html
    }
}

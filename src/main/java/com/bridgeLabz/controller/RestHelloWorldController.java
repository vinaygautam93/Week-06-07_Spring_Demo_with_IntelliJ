

package com.bridgeLabz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestHelloWorldController {

    @GetMapping("/hello")
    public String helloApi() {
        return "Hello from BridgeLabz"; // UC3: REST Output
    }
}

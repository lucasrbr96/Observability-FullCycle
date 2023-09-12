package com.elk.poc.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @GetMapping("/super-fast")
    public String getSuperFastApi() {
        return "I'm super fast.";
    }

    @GetMapping("/fast")
    public String getFastApi() throws InterruptedException {
        Thread.sleep(200); // sleep for 200 milliseconds
        return "I'm fast!";
    }

    @GetMapping("/slow")
    public String getSlowApi() throws InterruptedException {
        Thread.sleep(3000); // sleep for 3 seconds
        return "I'm slow :(";
    }

}

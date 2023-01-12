package com.example.demojenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("testing")
    public String testing(){
        return "testing trigger 6";
    }
}

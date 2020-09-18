package com.springbootdocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

    @RequestMapping("/hellodocker")
    public String hellodocker(){
        return "Hello Docker !!!";
    }
}

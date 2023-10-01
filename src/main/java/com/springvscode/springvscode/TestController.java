package com.springvscode.springvscode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class TestController {

    public String ankit = "<h2>Ankit Kashyap</h2>"+ "ankit";

    @GetMapping("/")
    public String index(){
        return ankit;
    }
}

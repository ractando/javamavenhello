package com.example.demosession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "This is a deployment from Azure DevOps pipelines!";

    @GetMapping("/")
    public String index() {
        int a = 1/0;
        return message;
    }
    @GetMapping("/error")
    public String error() {
        return "You have envountered an error. Please check Application Logs for further action.";
    }
}

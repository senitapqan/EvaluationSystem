package com.senitapqan.EvaluationSystem.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping(value = "/home")
    public String homePage() {
        return "home";
    }
}

package com.example.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowInfoController {

    @GetMapping("/showinfo")
    private String showInfo(Model model) {
        model.addAttribute("info", "tienph");
        return "helloworld";
    }
}

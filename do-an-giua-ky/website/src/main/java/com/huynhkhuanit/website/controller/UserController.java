package com.huynhkhuanit.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("message", "Xin chào từ Spring Boot!");
        return "users"; // Trả về file users.html trong templates/
    }
}

package com.mokke.componentbuilder.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mokke.componentbuilder.repository.RoleRepository;

@Controller
public class SecurityController {

    @Autowired
    RoleRepository roleRepository;

    @GetMapping("/login-page")
    public String loginPage (Model model) {
        return "login-page";
    }

    @GetMapping("/access-denied")
    public String accessDenied (Model model) {
        return "access-denied";
    }

    @GetMapping("/admin")
    public String adminPage(Model model) {
        return "admin";
    }

}

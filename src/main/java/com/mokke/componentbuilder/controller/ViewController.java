package com.mokke.componentbuilder.controller;

import java.io.IOException;
import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    // Create chat id and return main page
    @GetMapping("/")
    public String getMain (Model model) throws IOException, InterruptedException {
        String uniqueID = UUID.randomUUID().toString();
        model.addAttribute("sessionId",uniqueID);

        return "main-page";
    }

}

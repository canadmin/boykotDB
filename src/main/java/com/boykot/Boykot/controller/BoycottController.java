package com.boykot.Boykot.controller;


import com.boykot.Boykot.model.Boycott;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BoycottController {

    @RequestMapping("/newBoycott")
    public String addBoycott(Model model) {
        model.addAttribute("boycot", new Boycott());
        return "pages/newboycott.html";
    }

    @PostMapping("/sendBoycott")
    public String sendBoycottReq(@ModelAttribute("boycott") Boycott boycott,
                                 HttpServletRequest httpServletRequest) {

        return "pages/boycotts.html";
    }
}

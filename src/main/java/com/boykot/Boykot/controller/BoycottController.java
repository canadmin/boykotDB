package com.boykot.Boykot.controller;


import com.boykot.Boykot.business.BoycottService;
import com.boykot.Boykot.model.Boycott;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BoycottController {

    private BoycottService boycottService;

    @Autowired
    public BoycottController(BoycottService boycottService) {
        this.boycottService = boycottService;
    }

    @RequestMapping("/newBoycott")
    public String addBoycott(Model model) {
        model.addAttribute("boycot", new Boycott());
        return "pages/newboycott.html";
    }

    @PostMapping("/sendBoycott")
    public String sendBoycottReq(@ModelAttribute("boycott") Boycott boycott,
                                 HttpServletRequest httpServletRequest) {
        Boycott boycott1=new Boycott();
        boycott1.setBoycotted(boycott.getBoycotted());
        boycott1.setByWhom(boycott.getByWhom());
        boycott1.setReason(boycott.getReason());
        this.boycottService.addBoycott(boycott1);

        return "pages/boycotts.html";
    }

}

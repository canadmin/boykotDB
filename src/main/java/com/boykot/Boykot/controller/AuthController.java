package com.boykot.Boykot.controller;

import com.boykot.Boykot.business.UserService;
import com.boykot.Boykot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String LoginController(Model model){
        model.addAttribute("user",new User());
        return "index.html";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user,
                        HttpServletRequest httpServletRequest){

        System.out.println(user.getEmail());
        return "pages/boycotts.html";
    }

    @PostMapping("/regUser")
    public String register(@ModelAttribute("user") User user,
                        HttpServletRequest httpServletRequest){
        userService.registerUser(user);
        return "index.html";
    }
}

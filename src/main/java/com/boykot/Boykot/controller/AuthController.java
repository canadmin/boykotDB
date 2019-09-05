package com.boykot.Boykot.controller;

import com.boykot.Boykot.business.UserService;
import com.boykot.Boykot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class AuthController {

    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/login")
    public String LoginController(Model model){
        model.addAttribute("user",new User());
        return "index.html";
    }

    @GetMapping("/")
    public String login(@ModelAttribute("user") User user,
                        HttpServletRequest httpServletRequest){

        System.out.println(user.getEmail());
        return "pages/boycotts.html";
    }

    @PostMapping("/regUser")
    public String register(@Valid User user,
                           HttpServletRequest httpServletRequest,
                           BindingResult bindingResult,
                           Model model){
        if(bindingResult.hasErrors()){
            return "index.html";
        }
        userService.registerUser(user);
        return "index";
    }
}

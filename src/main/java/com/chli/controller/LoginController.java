package com.chli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Chl
 * @version 1.0
 * @date 2019/12/15 14:06
 */
@Controller
public class LoginController {

    @GetMapping({"/","login"})
    public String index(){
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

}

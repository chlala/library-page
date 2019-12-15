package com.chli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

//    @GetMapping({"/","login"})
//    public String index(){
//        return "index";
//    }

    @PostMapping("/search")
    public String search(){
        return "student/info";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/searchBook")
    public String searchBook(){
        return "user/searchBook";
    }

    @GetMapping("/ordinaryBookDetail")
    public String ordinaryBookDetail(){
        return "user/ordinaryBookDetail";
    }

    @GetMapping("/magazineDetail")
    public String magazineDetail(){
        return "user/magazineDetail";
    }

    @GetMapping("/paperDetail")
    public String paperDetail(){
        return "user/paperDetail";
    }

    @GetMapping("/index")
    public String userIndex(){
        return "user/index";
    }

    @GetMapping("/nowBorrow")
    public String nowBorrow(){
        return "user/nowBorrow";
    }

    @GetMapping("/info")
    public String info(){
        return "user/info";
    }

    @GetMapping("/email")
    public String email(){
        return "user/email";
    }

}

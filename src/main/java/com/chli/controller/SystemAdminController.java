package com.chli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chl
 * @version 1.0
 * @date 2019/12/12 17:11
 */
@Controller
@RequestMapping("/systemAdmin")
public class SystemAdminController {

    @GetMapping("/index")
    public String index(){
        return "systemAdmin/index";
    }

    @GetMapping("/listBookAdmin")
    public String listBookAdmin(){
        return "systemAdmin/listBookAdmin";
    }

    @GetMapping("/addBookAdmin")
    public String addBookAdmin(){
        return "systemAdmin/addBookAdmin";
    }

    @GetMapping("/updateBookAdmin")
    public String updateBookAdmin(){
        return "systemAdmin/editBookAdmin";
    }

    @GetMapping("/adSystemAdmin")
    public String adSystemAdmin(){
        return "systemAdmin/addSystemAdmin";
    }

    @GetMapping("/info")
    public String info(){
        return "systemAdmin/info";
    }

}

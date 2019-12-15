package com.chli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chl
 * @version 1.0
 * @date 2019/12/7 20:35
 */
@Controller
@RequestMapping("/bookAdmin")
public class BookAdminController {

    @GetMapping("/index")
    public String index(){
        return "bookAdmin/index";
    }

    @GetMapping("/addOrdinaryBook")
    public String addOrdinaryBook(){
        return "bookAdmin/addOrdinaryBook";
    }

    @GetMapping("/addMagazine")
    public String addMagazine(){
        return "bookAdmin/addMagazine";
    }

    @GetMapping("/addPaper")
    public String addPaper(){
        return "bookAdmin/addPaper";
    }

    @GetMapping("/borrow")
    public String borrow(){
        return "bookAdmin/borrow";
    }

    @GetMapping("/return")
    public String returnBook(){
        return "bookAdmin/return";
    }

    @GetMapping("/info")
    public String info(){
        return "bookAdmin/info";
    }

    @GetMapping("/pay")
    public String pay(){
        return "bookAdmin/pay";
    }

    @GetMapping("/reset")
    public String reset(){
        return "bookAdmin/reset";
    }

}

package com.kiki.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {

//    @GetMapping("{url}")
//    public String web(@PathVariable String url){
//        return url;
//    }


    @GetMapping("/web")
    public String web(){
        return "activity";
    }

    @GetMapping("/z")
    public String zhang(){
        return "zhang";
    }
}

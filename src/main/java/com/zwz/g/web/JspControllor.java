package com.zwz.g.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 *
 *
 */
@Controller
public class JspControllor {

    @GetMapping("/jsptest")
    public String login(@RequestParam(value = "") String test){
        return "/login";
    }

    @GetMapping("/b")
    public String b(Model model){
        model.addAttribute("aaa","bb");
        return "/true";
    }
}

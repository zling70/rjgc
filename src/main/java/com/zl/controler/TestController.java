package com.zl.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by THINK on 2017/5/10.
 */
@Controller
public class TestController {
    @RequestMapping("/index")
    public String index (ModelMap model){
        model.addAttribute("name","mygod");
        return "welcome";
    }
}

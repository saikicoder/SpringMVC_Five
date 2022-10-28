package org.sprinmvcproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
    @RequestMapping("/")
    public String displayOrder(){

        return "homepage";
    }
}

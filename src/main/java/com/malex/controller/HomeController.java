package com.malex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String indexGet() {
        return "index";
    }


    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String homeGet() {
        return "home";
    }

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public String createGet() {
        return "create";
    }

    @RequestMapping(path = "/update", method = RequestMethod.GET)
    public String updateGet() {
        return "update";
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public String deleteGet() {
        return "delete";
    }

    // Model model
    @RequestMapping(path = "/simpleModel", method = RequestMethod.GET)
    public String simpleModelGet(Model model) {
        model.addAttribute("nav", "home");
        return "home";
    }


}

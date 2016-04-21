package com.malex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String indexGet(Model model) {
        model.addAttribute("nav", "home");
        return "index";
    }

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public
    @ResponseBody
    String homeGet() {
        return "home";
    }

    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public
    @ResponseBody
    String createGet() {
        return "create";
    }

    @RequestMapping(path = "/update", method = RequestMethod.GET)
    public
    @ResponseBody
    String updateGet() {
        return "update";
    }

    @RequestMapping(path = "/delete", method = RequestMethod.GET)
    public
    @ResponseBody
    String deleteGet() {
        return "delete";
    }

}

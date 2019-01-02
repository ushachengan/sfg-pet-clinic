package com.mobileiron.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners/index", "/owners"})
    public String listOfOwners() {
        return "owners/index";
    }
}

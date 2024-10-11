package org.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

    @RequestMapping("/human")
    public String getHuman(){
        return "Men and Woman";
    }
}

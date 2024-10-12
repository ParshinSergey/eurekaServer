package org.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    @Value("${eureka.instance.instance-id}")
    private String id;

    @RequestMapping("/animal")
    public String getAnimal(){
        return "Elefant and Monkey. Instance-id = " + id;
    }
}

package com.tomasoft.genealogy.controller;

import com.tomasoft.genealogy.entity.User;
import com.tomasoft.genealogy.entity.UserRole;
import com.tomasoft.genealogy.service.AnimalService;
import com.tomasoft.genealogy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    private AnimalService animalService;


    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String helloWorld(){
        return "home";
    }
}

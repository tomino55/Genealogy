package com.tomasoft.genealogy.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String loginPage(){
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        if(authentication.isAuthenticated()){
//            return "redirect:/";
//        }
//        else{
//            return "login";
//        }
        return "login";
    }

    @RequestMapping(path = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication.isAuthenticated()){
            new SecurityContextLogoutHandler().logout(request,response,authentication);
            return "redirect:/";
        }
        else{
            return "redirect:/";
        }
    }

}

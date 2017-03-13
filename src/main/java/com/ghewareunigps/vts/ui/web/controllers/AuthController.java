/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author admin
 */
@Controller
@RequestMapping("/")
public class AuthController {
    
    @RequestMapping(method=GET)
    public String auth(){
        System.out.println("inside auth controller");
        return  "auth.html";
    }
    
}

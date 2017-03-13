/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.controllers;

import com.ghewareunigps.vts.ui.web.model.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */

@RestController
public class SignupController {
    
    @RequestMapping(value="/signup",method=POST)
    public Message signup(@RequestParam String username,@RequestParam String email,@RequestParam String password){
      
        return null;
    }
    
}

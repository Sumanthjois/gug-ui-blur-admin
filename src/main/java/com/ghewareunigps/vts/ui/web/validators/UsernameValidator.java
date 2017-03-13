/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class UsernameValidator extends Validator{

    private String regex = "[A-Za-z0-9_]+";
    private String username;
    
    public UsernameValidator(String username){
        this.username = username;
    }
    
    @Override
    public boolean validate() {
       return execute(regex,username);
    }
    
}

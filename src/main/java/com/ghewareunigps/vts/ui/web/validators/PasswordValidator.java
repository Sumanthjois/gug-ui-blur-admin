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
public class PasswordValidator extends Validator{

    private String regex ="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#><$%]).{6,20})";

    String password;
    
    public PasswordValidator(String password){
        this.password = password;
    }
 
     

    @Override
    public boolean validate() {
      return execute(regex,password);
    }
    
}

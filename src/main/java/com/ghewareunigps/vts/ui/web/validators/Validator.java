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
public abstract class Validator {
 
    public abstract boolean validate();    
    
    protected boolean execute(String regex,String data){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
      
        return matcher.matches();
    }
     
}

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
public class EmailValidator extends Validator{
    private String regex  =  "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\\\[[0-9]{1,3}\\\\.[0-9]{1,3}\\\\.[0-9]{1,3}\\\\.[0-9]{1,3}\\\\])|(([a-zA-Z\\\\-0-9]+\\\\.)+[a-zA-Z]{2,}))$";
    private String email;
    
    public EmailValidator(String email){
        this.email = email;
    }

    @Override
    public boolean validate() {
      return execute(regex,email);
    }
    
    
}

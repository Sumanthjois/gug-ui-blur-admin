/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.validators;

/**
 *
 * @author admin
 */
public class DataValidation {
    
    public boolean validate(String username,String email,String password){
        boolean isUsernameValid = new UsernameValidator(username).validate();
        boolean isPasswordValid = new PasswordValidator(password).validate();
        boolean isEmailValid = new EmailValidator(email).validate();
        
        return isUsernameValid && isPasswordValid && isEmailValid;
    }
    
}

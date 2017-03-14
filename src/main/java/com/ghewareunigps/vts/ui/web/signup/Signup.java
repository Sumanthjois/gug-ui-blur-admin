/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.signup;

import com.ghewareunigps.vts.ui.web.model.Message;
import com.ghewareunigps.vts.ui.web.model.User;
import com.ghewareunigps.vts.ui.web.validators.DataValidation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 *
@Aspect
@Component
public class Signup {

    private DataValidation dataValidation;
    private Message message;
    
    public Signup(){
        dataValidation = new DataValidation();
    }
    
    @Around("execution(* com.ghewareunigps.vts.ui.web.controllers.SignupController.signup(..)) && args(user,..)")
    public Message validateAndSignup(ProceedingJoinPoint joinPoint, User user) throws Throwable {
        
        if(dataValidation.validate(user.getUsername(), user.getEmail(), user.getPassword())){
            message = (Message) joinPoint.proceed();
        }else{
            message = new Message(false,"Please enter a valid credentials");
        }
        
        
        return message;
    }

}
*/



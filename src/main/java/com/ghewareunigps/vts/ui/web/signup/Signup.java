/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.signup;

import com.ghewareunigps.vts.ui.web.model.Message;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author admin
 */
@Aspect
public class Signup {
    
    @AfterReturning(pointcut = "execution(* com.ghewareunigps.vts.ui.web.controllers.SignupController.signup(..))",returning = "retVal")
    public void signupUser(Object message){
          Message msg = (Message) message;
          
          if(msg.getResult()){
              
          
          }
          
    }
    
}

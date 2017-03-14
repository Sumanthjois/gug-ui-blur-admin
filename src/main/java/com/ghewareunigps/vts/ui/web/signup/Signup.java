/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.signup;

import com.ghewareunigps.vts.ui.web.db.UsersRepository;
import com.ghewareunigps.vts.ui.web.model.Message;
import com.ghewareunigps.vts.ui.web.model.User;
import com.ghewareunigps.vts.ui.web.validators.DataValidation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author admin
 */
@Aspect
@Component
public class Signup {

    private DataValidation dataValidation;
    private Message message;
    private UsersRepository repository;

    @Autowired
    public Signup(UsersRepository repository) {
        dataValidation = new DataValidation();
        this.repository = repository;
    }

    @Around("execution(* com.ghewareunigps.vts.ui.web.controllers.SignupController.signup(..)) && args(user,..)")
    public Message validateAndSignup(ProceedingJoinPoint joinPoint, User user) throws Throwable {
        user.setRole(User.ROLE_USER);
        if (dataValidation.validate(user.getUsername(), user.getEmail(), user.getPassword())) {
            if (repository.findByEmailOrUsername(user).isEmpty()) {
                message = (Message) joinPoint.proceed();
                boolean isSaved = repository.save(user);
            } else {
                message = new Message(false, "The user already exists");
            }
        } else {
            message = new Message(false, " please recheck your credentials");
        }

        return message;
    }

}

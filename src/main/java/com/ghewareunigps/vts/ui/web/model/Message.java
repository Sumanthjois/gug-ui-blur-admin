/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.model;

/**
 *
 * @author admin
 */
public class Message {
    
    private boolean result;
    private String message;
    
    
    public Message(){
        
    }

    public Message(boolean result,String messsage){
        this.result = result;
        this.message = message;
    }
    
    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
    
}

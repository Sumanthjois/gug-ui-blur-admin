/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.model;


public class User {
     
      public static final String ROLE_USER = "ROLE_USER";
    
      private String username;
      private String email;
      private String password;
      private String role;
      
      public User(){
          
      }
      
      public User(String username,String email,String password){
          this.username = username;
          this.password = password;
          this.email = email;
      }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

   

      
      
      
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
      
      
      
}

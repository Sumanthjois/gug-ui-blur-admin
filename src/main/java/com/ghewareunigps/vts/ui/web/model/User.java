/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.model;


public class User {
      private String username;
      private String email;
      private String password;
      
      
      public User(){
          
      }
      
      public User(String username,String email,String password){
          this.username = username;
          this.password = password;
          this.email = email;
      }
    
}

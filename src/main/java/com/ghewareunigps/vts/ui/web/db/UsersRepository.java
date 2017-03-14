/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.db;

import com.ghewareunigps.vts.ui.web.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */

@Repository
public class UsersRepository implements UserDao{

  private JdbcTemplate template;
  
  @Autowired
  public UsersRepository(JdbcTemplate template){
      this.template = template;
  }

  
  @Override
  public boolean save(final User user){
      String query = "insert into BlurAdminUsers (username,email,password,role) values (?,?,?,?)";
     
      return template.execute(query, new PreparedStatementCallback<Boolean>(){
          @Override
          public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
              
              ps.setString(1, user.getUsername());
              ps.setString(2, user.getEmail());
              ps.setString(3,user.getPassword());
              ps.setString(4, user.getRole());
              
              return ps.execute();
          }
          
      });
      
  }
  
    
  public List<User> findByEmailOrUsername(User user){
      String query = "select * from  BlurAdminUsers where email=? or username=?";
          
          List<User> users =  template.query(query, new Object[]{user.getEmail(),user.getUsername()}, new RowMapper<User>(){
          @Override
          public User mapRow(ResultSet rs, int i) throws SQLException {
              User user = new User();           
             
              user.setUsername(rs.getString(2));
              user.setEmail(rs.getString(3));
              
              return user;
          }
     });
      
     return users;
  }
  
}

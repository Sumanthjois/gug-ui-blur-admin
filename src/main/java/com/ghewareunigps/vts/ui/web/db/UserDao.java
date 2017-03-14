/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghewareunigps.vts.ui.web.db;

import com.ghewareunigps.vts.ui.web.model.User;

/**
 *
 * @author admin
 */
public interface UserDao {
    public boolean save(User user);
}

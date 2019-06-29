/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramli.users;

import com.ramli.database.DBConfiguration;
import com.ramli.security.DigestMatcher;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Jevison7x
 */
public class UserDAO
{
    public static boolean createAccount(User user, String enc_password) throws ClassNotFoundException, IllegalArgumentException, IOException, SQLException
    {
        DBConfiguration dBConfiguration = new DBConfiguration();
        try(Connection conn = dBConfiguration.getDatabaseConnection())
        {
            String sql = "INSERT INTO users (email, password, name, dateRegistered) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getEmail());
            pst.setString(2, enc_password);
            pst.setString(3, user.getName());
            pst.setTimestamp(4, new Timestamp(new Date().getTime()));
            int update = pst.executeUpdate();
            return update == 1;
        }
    }

    public static User authenticateUser(String email, String password) throws ClassNotFoundException, IOException, SQLException
    {
        DBConfiguration dbConfig = new DBConfiguration();
        try(Connection conn = dbConfig.getDatabaseConnection())
        {
            String sql = "SELECT * FROM  users WHERE email = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                DigestMatcher matcher = new DigestMatcher();
                String encryptedPassword = rs.getString("password");
                String salt = matcher.getSalt(encryptedPassword);
                boolean matched = matcher.doMatch(password, salt);
                if(matched)
                {
                    User user = new User();
                    user.setEmail(rs.getString("email"));
                    user.setName(rs.getString("name"));
                    return user;
                }
                else
                    return null;
            }
            else
                return null;
        }
    }
}

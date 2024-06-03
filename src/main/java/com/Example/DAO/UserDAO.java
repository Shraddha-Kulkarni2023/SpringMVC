package com.Example.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    @Autowired
    private JdbcTemplate template1;

    public void insertdata(String username, String password) {
        String sql1 = "INSERT INTO User (username, password) values (?,?)";
        template1.update(sql1, username,password);
    }




}

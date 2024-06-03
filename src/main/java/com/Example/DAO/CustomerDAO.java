package com.Example.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {

    @Autowired
    private JdbcTemplate template2;

    public void Customerinsert(String firstname, String lastname, String middlename, String gender) {
        String sql2 = "INSERT INTO Customer(FirstName, LastName, MiddleName, Gender) values (?,?,?,?)";
        template2.update(sql2,firstname,lastname,middlename,gender);
    }

}

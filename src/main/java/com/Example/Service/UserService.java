package com.Example.Service;

import com.Example.DAO.CustomerDAO;
import com.Example.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO obj1;

    public void service1(String Username, String Password) {
        obj1.insertdata(Username,Password);
    }

}

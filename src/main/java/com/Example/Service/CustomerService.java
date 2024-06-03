package com.Example.Service;

import com.Example.DAO.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO obj2;

    public void service2(String fname, String lname, String mname, String gender) {
        obj2.Customerinsert(fname,lname,mname,gender);
    }
}

package com.Example;

import com.Example.DAO.UserDAO;
import com.Example.Model.User;
import com.Example.Service.CustomerService;
import com.Example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {

    @Autowired
    private UserService userservice;

    @Autowired
    private CustomerService custservice;
    @RequestMapping("/welcome")
    public String welcome() {

        return "welcome";
    }

    @RequestMapping("/loginform")
    public String loginform() {
       return "form";


    }

    @RequestMapping(value = "/disobj", method = RequestMethod.GET)
    public ModelAndView getobj() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        User user1 = new User();
        user1.setUsername("Shubhaam");
        user1.setPassword("Kulkarni");
        modelAndView.addObject("user1",user1);
        return modelAndView;
    }

    @PostMapping("/formaction")
    public String formaction(@RequestParam("username") String uname, @RequestParam("password") String pwd, Model model) {

        if("shraddha".equals(uname) && "kulk".equals(pwd)) {

            userservice.service1(uname,pwd);
            model.addAttribute("uname", uname);
            return "success2";
        } else {
            return "Error";
        }
    }

    @RequestMapping("/customerregistration")
    public String customerregistration() {
        return "CustomerRegistration";
    }

    @PostMapping("/register")
    public String register(@RequestParam("firstname") String fname, @RequestParam("lastname") String lname, @RequestParam("middlename") String mname, @RequestParam("gender") String gender, ModelMap modelmap) {

        if(fname.isEmpty() || lname.isEmpty() || mname.isEmpty() || gender.isEmpty()) {

            return "Error";
        } else {
            custservice.service2(fname, lname, mname, gender);
            modelmap.addAttribute("fname", fname);
            modelmap.addAttribute("lname", lname);
            return "customersuccess";
        }

    }







}

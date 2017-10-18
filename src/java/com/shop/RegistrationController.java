/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop;


import com.shop.dao.UserService;
import com.shop.model.User;
import com.shop.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/register")
public class RegistrationController {
    
    @Autowired
    UserService us;
    @RequestMapping()
    public String registerForm(Model model){
        RegisterFormBean registerBean = new RegisterFormBean();
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }
    @RequestMapping(value = "/save")
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean,
            Model model){
        User user = new User();
        user.setFirstname(registerBean.getFirstName());
        user.setLastname(registerBean.getLastName());
        user.setUsername(registerBean.getUserName());
        user.setPassword(registerBean.getPassword());
        
        us.saveUser(user);
        //System.out.println("fisrt name : "+ registerBean.getFirstName());
        model.addAttribute("data", registerBean);
        
        return "successregistration";
    }
    
}

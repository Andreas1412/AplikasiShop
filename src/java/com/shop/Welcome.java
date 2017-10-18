/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 200NS
 */
@Controller
@RequestMapping("/welcome")
public class Welcome {

    @RequestMapping()
    public String Welcome(HttpSession session, Model model) {
        model.addAttribute("msg", "Selamat Datang di HomePage Indocyber");
        return "welcome";
    }
    
    
    
}
    


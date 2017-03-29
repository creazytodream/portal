package com.ht.controller;

import com.ht.main.UserDomain;
import com.ht.service.UserService;
import com.ht.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2017/3/21.
 */
@Controller
@RequestMapping(value = "users")
public class UserController {

        private  final  String direct="users/";

        @Autowired
        private UserService service;


    @RequestMapping(value = "list")
    public  String list(Model model){
        System.out.println("进来了----------------------------------");
        System.out.println("进来了----------------------------------");
        System.out.println("进来了----------------------------------");
        System.out.println("进来了----------------------------------");
        System.out.println("进来了----------------------------------");
        System.out.println("进来了----------------------------------");

        model.addAttribute("users",service.findList(BeanUtils.toMap(new UserDomain())));
        return  direct+"users";
    }



    @RequestMapping("delete")
    public  String delete(@RequestParam("id") String id){
        service.delete(Integer.parseInt(id));
        return  direct+"users";
    }


    @RequestMapping("create")
    public  String creates(){

        return  direct+"users";
    }

    @RequestMapping("get")
    public  String get(Model model,@RequestParam("id") String id){
        UserDomain userDomain=service.get(Integer.parseInt(id));
        model.addAttribute("user",userDomain);
        return  direct+"users-inf";
    }

}

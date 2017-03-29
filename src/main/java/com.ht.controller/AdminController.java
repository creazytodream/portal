package com.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/23.
 */
@Controller
@RequestMapping("admin")
public class AdminController  extends  BaseController{


    @RequestMapping("list")
    public String list() {
        return "";
    }


}

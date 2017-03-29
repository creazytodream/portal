package com.ht.controller;

import com.ht.util.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/3/21.
 */
@Controller
@RequestMapping(value = "index")
public class BaseController {

    protected Logger logger = Logger.getLogger(this.getClass());

    private static final long serialVersionUID = 6357869213649815390L;



    /**
     * 得到分页列表的信息
     */


    public static void logBefore(Logger logger, String interfaceName){
        logger.info("");
        logger.info("start");
        logger.info(interfaceName);
    }

    public static void logAfter(Logger logger){
        logger.info("end");
        logger.info("");
    }



    @RequestMapping(value = "index")
    public  String index(HttpServletRequest request)
    {

        return "index";
    }


    @RequestMapping(value = "login")
    public  String login(HttpServletRequest request)
    {

        return  "login";
    }



@RequestMapping(value = "indexs")
    public  String indexs(HttpServletRequest request)
{

    System.out.println("999999999999999999999999999999");
        return "indexs";
    }



}

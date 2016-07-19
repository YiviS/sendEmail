package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xuguang on 2016/7/5.
 */
@Controller
public class IndexController {

    /**
     *  @Author xuguang
     *  @注释 
     *  @Date 2016/7/5 17:40
     */
    @RequestMapping("/")
    public String index(){
        String a = 'text';
        return "index";
    }
}

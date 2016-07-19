package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.impl.RegisterValidateService;
import com.tools.ServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;


@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private RegisterValidateService service;

    @RequestMapping(value="/register",method={RequestMethod.GET,RequestMethod.POST})
    public ModelAndView load(HttpServletRequest request, HttpServletResponse response) throws ParseException {
        String action = request.getParameter("action");
        System.out.println("-----r----"+action);
        ModelAndView mav=new ModelAndView();

        if("register".equals(action)) {
            //注册
            String email = request.getParameter("email");
            service.processregister(email);//发邮箱激活
            mav.addObject("text","注册成功");
            mav.setViewName("register_success");
        }
        else if("activate".equals(action)) {
            //激活
            String email = request.getParameter("email");//获取email
            String validateCode = request.getParameter("validateCode");//激活码

            try {
                service.processActivate(email , validateCode);//调用激活方法
                mav.setViewName("activate_success");
            } catch (ServiceException e) {
                request.setAttribute("message" , e.getMessage());
                mav.setViewName("activate_failure");
            }

        }
        return mav;
    }
}
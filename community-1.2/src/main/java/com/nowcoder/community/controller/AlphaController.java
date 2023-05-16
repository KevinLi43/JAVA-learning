package com.nowcoder.community.controller;

import com.nowcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello Spring Boot.";
    }

    @RequestMapping("/data")
    @ResponseBody
    public String getData() {
        return alphaService.find();
    }

//    @RequestMapping("/http")
//    public void http(HttpServletRequest request, HttpServletResponse response){
//        //获取请求
//        System.out.println(request.getMethod());
//        System.out.println(request.getServletPath());
//        System.out.println(request.getParameter("code"));
//
//        //返回响应数据
//        response.setContentType("text/html;charset=utf-8");
//    }

    // GET请求
    @RequestMapping(path = "/students", method = RequestMethod.GET)
    @ResponseBody
    public String getstudents(){
        return "some students";
    }

}

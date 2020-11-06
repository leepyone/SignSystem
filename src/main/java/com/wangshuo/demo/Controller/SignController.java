package com.wangshuo.demo.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wangshuo.demo.Entity.User;
import com.wangshuo.demo.Entity.classes;
import com.wangshuo.demo.Service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@RestController
public class SignController {

    @Autowired
    private SignService signService;


    @PostMapping("/user/getUser")
    public String getUserByAccount(HttpServletRequest request ){
        String account = request.getParameter("account");
        String password = request.getParameter("password");

        User  user = signService.getUserByAccount(Integer.parseInt(account.trim()));
        String text = JSON.toJSONString(user);
        JSONObject Message = new JSONObject();
        if(user!=null&&user.getUserPassword().equals(password.trim())){
            return "true";
        }else
            return "false";

    }
    @PostMapping("/class/allClass")
    public List getClassesByAccount(HttpServletRequest request){
        String account = request.getParameter("account");
        System.out.println(account);
        User teacher = signService.getUserByAccount(Integer.parseInt(account));
        int teacherId = teacher.getUserId();
        List<classes> classesList = signService.getAllClass(teacherId);
        return classesList;
    }

    @PostMapping("/user/AllStudents")
    public List<User> getAllStudentsByCI(HttpServletRequest request){
        String classId = request.getParameter("classId");
        List<User> studentList = signService.getAllStudentsByCI(Integer.parseInt(classId.trim()));
        return studentList;

    }

}

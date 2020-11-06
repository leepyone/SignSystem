package com.wangshuo.demo.Service;

import com.wangshuo.demo.Entity.User;
import com.wangshuo.demo.Entity.classes;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SignService {

    User getUserByAccount(int userAccount);

    List<classes> getAllClass(int teacherId);

    List<User> getAllStudentsByCI(int classId);
}

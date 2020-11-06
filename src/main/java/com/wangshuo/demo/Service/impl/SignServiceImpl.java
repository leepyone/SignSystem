package com.wangshuo.demo.Service.impl;

import com.wangshuo.demo.Dao.SignDao;
import com.wangshuo.demo.Entity.User;
import com.wangshuo.demo.Entity.classes;
import com.wangshuo.demo.Service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {
    @Autowired
    private SignDao signDao;

    @Override
    public User getUserByAccount(int userAccount) {
        return signDao.getUserByAccount(userAccount);
    }

    @Override
    public List<classes> getAllClass(int teacherId) {
        return signDao.getAllClassById(teacherId);
    }

    @Override
    public List<User> getAllStudentsByCI(int classId) {
        return signDao.getAllStudentsByCI(classId);
    }
}

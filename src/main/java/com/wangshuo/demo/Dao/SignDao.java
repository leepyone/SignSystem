package com.wangshuo.demo.Dao;


import com.wangshuo.demo.Entity.User;
import com.wangshuo.demo.Entity.classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SignDao {

    @Select("select * from  user where user_account=#{userAccount}")
    User getUserByAccount(int userAccount);

    @Select("select * from class  where teacher_id=#{teacherId}")
    List<classes> getAllClassById(int teacherId);


    @Select("select `user`.user_id,`user`.user_name ,`user`.user_type from user , user_class where user_class.student_id = `user`.user_id and user_class.class_id=#{classId}")
    List<User> getAllStudentsByCI( int classId);



}

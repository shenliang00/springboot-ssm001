package com.ssm.dao;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao {

    Student selectById(int id);

    void add(Student student);

    void update(Student student);

    void delete(String name);
}

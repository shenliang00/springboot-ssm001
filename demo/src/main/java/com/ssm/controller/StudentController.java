package com.ssm.controller;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    /**
     * @author sl
     */
    @Autowired
    private StudentDao studentDao;
    @RequestMapping("/study")
     public Student study(){
         return studentDao.selectById(2);
     }

}

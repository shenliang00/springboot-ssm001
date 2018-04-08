package com.ssm;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
   @Autowired
   private StudentDao studentDao;

	@Test
	public void test6(){
		Student student = studentDao.selectById(1);
		System.out.println(student);
	}

	//修改
	@Test
	public void test5(){
		Student student1 = new Student();
		student1.setId(8);
		student1.setName("王仕鹏");
		studentDao.update(student1);
		System.out.println("修改成功");
	}
	//添加
	@Test
	public void test3(){
		Student student1 = new Student();
		student1.setName("易建联");
		student1.setSex("男");
		student1.setAddress("广东宏远");
		studentDao.add(student1);
		System.out.println("添加成功");
	}
   @Test
	public void test4(){
	  studentDao.delete("哈登");
	    System.out.println("删除成功");
   }
}

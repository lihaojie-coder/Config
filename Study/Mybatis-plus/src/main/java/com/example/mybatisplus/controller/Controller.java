package com.example.mybatisplus.controller;

import com.example.mybatisplus.mapper.UserMapper;
import com.example.mybatisplus.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/select")
    public void adminPage(Model model){
        System.out.println("--------selectAll method test-------");
        //查询全部用户，参数是一个Wrapper，条件构造器，先不使用为null
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

    }
    @RequestMapping("/update")
    public void Update(Model model){
            User user = new User();
            //可以通过条件自动拼接动态SQL
            user.setId(5l);
            user.setName("接口");
            user.setAge(100);
            //updateById 参数是一个对象！
            int i = userMapper.updateById(user);
            System.out.println(i);
    }

    //测试乐观锁成功
    @RequestMapping("/suo")
    public void suo(Model model) {
        User user = userMapper.selectById(1l);
        //2.修改用户信息
        user.setName("tian");
        user.setAge(21);
        //3.执行更新操作
        userMapper.updateById(user);
    }
}

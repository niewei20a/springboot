package com.wzu.springboot.service.Impl;

import com.wzu.springboot.dao.UserMapper;
import com.wzu.springboot.pojo.User;
import com.wzu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean checkUser(User user)  {
        try {
            if(userMapper.checkUser(user) >=1 || userMapper.checkUserByName(user)>=1 || userMapper.checkUserByEmail(user)>=1){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public String registerUser(User user) {
        if(user.getPhone().equals("")){
            if(userMapper.checkByEmail(user)>=1){
                return "已存在该邮箱";
            }else {
                userMapper.insertByEmail(user);
                return "注册成功";
            }
        }else {
            if(userMapper.checkByPhone(user)>=1){
                return "已存在该手机号";
            }else {
                userMapper.insertByPhone(user);
                return "注册成功";
            }
        }
    }
}

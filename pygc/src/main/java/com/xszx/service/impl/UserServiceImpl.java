package com.xszx.service.impl;

import com.xszx.beans.User;
import com.xszx.dao.UserDao;
import com.xszx.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Learning makes me happy.
 * @date 2023/2/9 10:46
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public User login(String phone, String password) {
        UserDao userDao = sqlSessionTemplate.getMapper(UserDao.class);
        User user=userDao.login(phone,password);
        return user;
    }

    @Override
    public User checkPhone(String phone) {
        UserDao userDao= sqlSessionTemplate.getMapper(UserDao.class);
        User user= userDao.checkPhone(phone);
        return user;
    }

    @Override
    public void addUser(String phone, String password) {
        UserDao userDao= sqlSessionTemplate.getMapper(UserDao.class);
        userDao.addUser(phone,password);
    }

    @Override
    public void updatePassword(String phone, String newPassword) {
        UserDao userDao= sqlSessionTemplate.getMapper(UserDao.class);
        userDao.updatePassword(phone,newPassword);
    }
}

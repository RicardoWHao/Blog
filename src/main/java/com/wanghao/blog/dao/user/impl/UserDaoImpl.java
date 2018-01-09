package com.wanghao.blog.dao.user.impl;

import com.wanghao.blog.dao.user.UserDao;
import com.wanghao.blog.model.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/1/9.
 */
@Component("userDao")
public class UserDaoImpl implements UserDao{

    @Resource(name="sqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;


    @Override
    public void insertUser(User user) {
        sqlSessionTemplate.insert("user.insertUser", user);
    }
}

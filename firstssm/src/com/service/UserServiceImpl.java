package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.po.MyUser;

@Service("userService")
@Transactional
/**
 * 加上注解@Transactional可以指定这个类需要受Spring的事务管理，注解@Transactional只能针对public属性范围内的方法添加，
 * 本案例并不需要处理事务，在这里只是告诉自己如何使用事务
 * @author hfy
 * 2019年5月7日
 */
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public List<MyUser> selectUserByUname(MyUser user){
		return userDao.selectUserByUname(user);
	}
}

package com.wcms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wcms.dao.IUserDao;
import com.wcms.model.UserEntity;
import com.wcms.service.IUserService;

public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public List<UserEntity> findAll() {
		return userDao.selectAll();
	}

}

package com.wcms.dao;

import java.util.List;

import com.wcms.model.UserEntity;

public interface IUserDao {

	List<UserEntity> selectAll();
}

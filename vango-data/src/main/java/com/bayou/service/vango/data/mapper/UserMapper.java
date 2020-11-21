package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.User;

import java.util.List;

public interface UserMapper {
	
	List<User> getAll();
	
	User getOne(Long id);

	void insert(User user);

	void update(User user);

	void delete(Long id);

}
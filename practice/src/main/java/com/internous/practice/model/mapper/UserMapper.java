package com.internous.practice.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.internous.practice.model.domain.User;

@Mapper
public interface UserMapper {

	List<User> findByUserNameAndPassword(
			@Param("userName") String userName,
			@Param("password") String password
			);
}

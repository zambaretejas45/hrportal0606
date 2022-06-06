package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.pojo.LoginDetails;

public class LoginDetailsRowMapper implements RowMapper<LoginDetails>{

	
	@Override
	public LoginDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int loginId= resultSet.getInt("LOGIN_ID");
		String userName= resultSet.getString("USERNAME");
		String password=resultSet.getString("PASSWORD");
		LoginDetails loginDetails = new LoginDetails(loginId, userName, password);
		return loginDetails;
	}
}

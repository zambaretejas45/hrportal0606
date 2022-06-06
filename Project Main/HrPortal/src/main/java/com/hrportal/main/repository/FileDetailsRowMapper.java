package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.FileDetails;

public class FileDetailsRowMapper implements RowMapper<FileDetails> {

	@Override
	public FileDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int fileId = resultSet.getInt("FILE_ID");
		String fileName= resultSet.getString("FILE_NAME");
	     
		CandidateDetails candidateId;
		
		FileDetails fileDetails = new FileDetails(fileId, fileName, fileName, null);
		return fileDetails;
		
	}

}

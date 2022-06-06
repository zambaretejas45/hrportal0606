package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.JobRequestDetails;

public class CandidateDetailsRowMapper implements RowMapper<CandidateDetails> {

	@Override
	public CandidateDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		int candidateId=resultSet.getInt("CANDIDATE_ID");
		String firstName= resultSet.getString("FIRST_NAME");
		String lastName=resultSet.getString("LAST_NAME");
		String emailId=resultSet.getString("EMAIL_ID");
		long contactNo=resultSet.getLong("CONTACT_NO");
		String qualification=resultSet.getString("QUALIFICATION");
		int experience=resultSet.getInt("EXPERIENCE");
		String primarySkill1=resultSet.getString("PRIMARY_SKILL_1");
		String primarySkill2=resultSet.getString("PRIMARY_SKILL_2");;
		String primarySkill3=resultSet.getString("PRIMARY_SKILL_3");;
		String applicationStatus = resultSet.getString("APPLICATION_STATUS");
		
		JobRequestDetails jobId;
		CandidateDetails candidateDetails = new CandidateDetails(candidateId, firstName, lastName, emailId, contactNo, qualification, experience, primarySkill1, primarySkill2, primarySkill3, applicationStatus, null);
		return candidateDetails;
	
	}

}

package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hrportal.main.pojo.CandidateDetails;
import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.InterviewDetails;

public class InterviewDetailsRowMapper {
	public InterviewDetails mapRow(ResultSet resulSet, int i) throws SQLException {
		
		
		 int interviewId = resulSet.getInt("INTERVIEW_ID");
			int aptitudeRound=resulSet.getInt("APTITUDE_ROUND");
			 int technicalId=resulSet.getInt("TECHNICAL_ROUND");
			 int hrRound=resulSet.getInt("HR_ROUND");
		 String remarks= resulSet.getString("REMARKS");
			 String interviewStatus=resulSet.getString("INTERVIEW_STATUS");
			EmployeeDetails interviewerId;
			CandidateDetails candidateId;
			
			InterviewDetails interviewDetails=new InterviewDetails(interviewId, aptitudeRound, technicalId, hrRound, remarks, interviewStatus, null, null);
			return interviewDetails;
		}
}

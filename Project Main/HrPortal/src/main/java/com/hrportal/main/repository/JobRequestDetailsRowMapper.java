package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hrportal.main.pojo.EmployeeDetails;
import com.hrportal.main.pojo.JobRequestDetails;
import com.hrportal.main.pojo.ProjectMaster;

public class JobRequestDetailsRowMapper implements RowMapper<JobRequestDetails> {

	@Override
	public JobRequestDetails mapRow(ResultSet resultSet, int i) throws SQLException {

		int jobId = resultSet.getInt("JOB_ID");
		String qualification=resultSet.getString("QUALIFICATION");
		String primarySkill1 = resultSet.getString("PRIMARY_SKILL_1");
		String primarySkill2= resultSet.getString("PRIMARY_SKILL_2");;
		String primarySkill3= resultSet.getString("PRIMARY_SKILL_3");;
		String jobRequestStatus=resultSet.getString("JOB_REQUEST_STATUS");;
		int experience = resultSet.getInt("EXPERIENCE");
		int requiredNoOfEmployees= resultSet.getInt("REQUIRED_NO_OF_EMPLOYEES");
		
		int employeeId = resultSet.getInt("EMPLOYEE_ID");
		EmployeeDetails employeeDetails = new EmployeeDetails() ;
		employeeDetails.setEmployeeId(employeeId);
		
		int projectid = resultSet.getInt("PROJECT_ID");
		ProjectMaster projectMaster=new ProjectMaster();
		projectMaster.setProjectId(projectid);
		JobRequestDetails jobRequestDetails = new JobRequestDetails(jobId, qualification, primarySkill1, primarySkill2, 
				primarySkill3, jobRequestStatus, 
				experience, requiredNoOfEmployees, employeeDetails, projectMaster);

		return jobRequestDetails;
	
	}
	
}

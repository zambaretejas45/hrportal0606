package com.hrportal.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.JobRequestDetails;
import com.hrportal.main.pojo.ProjectMaster;
@Repository
public class JobRequestDetailsRepository implements JobRequestDetailsRepositoryInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;
//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private static String INSERT_JOB_REQUEST_DETAILS = "INSERT INTO JOB_REQUEST_DETAILS(EMPLOYEE_ID, PROJECT_ID, "
			+ "QUALIFICATION, PRIMARY_SKILL_1, PRIMARY_SKILL_2, PRIMARY_SKILL_3,"
			+ "	JOB_REQUEST_STATUS, EXPERIENCE, REQUIRED_NO_OF_EMPLOYEES) VALUES(?,?,?,?,?,?,?)";
//	=====================================================================================================================
	private static String SELECT_ALL_JOB_REQUEST_DETAILS="SELECT* FROM JOB_REQUEST_DETAILS";
//	=====================================================================================================================
	private static String SELECT_SINGLE_JOB_REQUEST_DETAILS="SELECT * FROM JOB_REQUEST_DETAILS WHERE JOB_ID = ?";
//	=====================================================================================================================
	private static String UPDATE_JOB_REQUEST_DETAILS="UPDATE JOB_REQUEST_DETAILS SET EMPLOYEE_ID = ?,PROJECT_ID = ?, QUALIFICATION=?,"
			+ " PRIMARY_SKILL_1=?,PRIMARY_SKILL_2=?,PRIMARY_SKILL_3=?, JOB_REQUEST_STATUS=?, EXPERIENCE=?, REQUIRED_NO_OF_EMPLOYEES=?"
			+ " WHERE JOB_ID = ?";
//=========================================================================================================================
	private static String DELETE_JOB_REQUEST_DETAILS="DELETE JOB_REQUEST_DETAILS WHERE JOB_ID = ?";
//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private int resultCount;
	
	
	@Override
	public boolean addJobRequestDetails(JobRequestDetails jobRquestDetails) {
		Object[] args = {jobRquestDetails.getEmployeeId(),jobRquestDetails.getJobId() ,jobRquestDetails.getQualification(), 
				jobRquestDetails.getPrimarySkill1(),jobRquestDetails.getPrimarySkill2(), jobRquestDetails.getPrimarySkill3(),
				jobRquestDetails.getJobRequestStatus(),jobRquestDetails.getExperience(),jobRquestDetails.getRequiredNoOfEmployees()};
		resultCount = jdbcTemplate.update(INSERT_JOB_REQUEST_DETAILS, args);
		if (resultCount > 0) {
			return true;
		} else
			return false;
		
	}

	@Override
	public boolean updateJobRequestDetails(JobRequestDetails jobRquestDetails) {
		Object[] args = {jobRquestDetails.getEmployeeId(),jobRquestDetails.getJobId() ,jobRquestDetails.getQualification(), 
				jobRquestDetails.getPrimarySkill1(),jobRquestDetails.getPrimarySkill2(), jobRquestDetails.getPrimarySkill3(),
				jobRquestDetails.getJobRequestStatus(),jobRquestDetails.getExperience(),jobRquestDetails.getRequiredNoOfEmployees(),
				jobRquestDetails.getJobId()};
		resultCount = jdbcTemplate.update(UPDATE_JOB_REQUEST_DETAILS, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteJobRequestDetailsDetails(int jobId) {
		Object[] args = {jobId};
		resultCount = jdbcTemplate.update(UPDATE_JOB_REQUEST_DETAILS, args);
		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public JobRequestDetails getJobRequestDetailsByJobId(int jobId) {
		Object[] args = { jobId };
		JobRequestDetails jobRequestDetails = jdbcTemplate.queryForObject(SELECT_SINGLE_JOB_REQUEST_DETAILS, new JobRequestDetailsRowMapper(), args);
		return jobRequestDetails;
	}

	@Override
	public List<JobRequestDetails> getAllJobRequestDetails() {
		List<JobRequestDetails> jobRequestDetails = jdbcTemplate.query(SELECT_ALL_JOB_REQUEST_DETAILS, new JobRequestDetailsRowMapper());
		return jobRequestDetails;
	}

}

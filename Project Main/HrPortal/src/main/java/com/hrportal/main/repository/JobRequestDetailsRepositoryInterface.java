package com.hrportal.main.repository;

import java.util.List;

import com.hrportal.main.pojo.JobRequestDetails;

public interface JobRequestDetailsRepositoryInterface {

	
	public boolean addJobRequestDetails(JobRequestDetails jobRquestDetails);
	public boolean updateJobRequestDetails(JobRequestDetails jobRquestDetails);
	public boolean deleteJobRequestDetailsDetails(int jobId);
	public JobRequestDetails getJobRequestDetailsByJobId(int jobId);
	public  List<JobRequestDetails> getAllJobRequestDetails();
}

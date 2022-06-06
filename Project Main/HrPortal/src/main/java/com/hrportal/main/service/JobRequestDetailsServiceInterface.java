package com.hrportal.main.service;

import java.util.List;

import com.hrportal.main.pojo.JobRequestDetails;

public interface JobRequestDetailsServiceInterface {

	public boolean addJobRequestDetails(JobRequestDetails jobRequestDetails);
	public boolean updateJobRequestDetails(JobRequestDetails jobRequestDetails);
	public boolean deleteJobRequestDetailsDetails(int jobId);
	public JobRequestDetails getJobRequestDetailsByJobId(int jobId);
	public  List<JobRequestDetails> getAllJobRequestDetails();

}

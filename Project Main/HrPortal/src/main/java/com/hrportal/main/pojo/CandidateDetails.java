package com.hrportal.main.pojo;

public class CandidateDetails {

	private int candidateId;
	private String firstName;
	private String lastName;
	private String emailId;
	private long contactNo;
	private String qualification;
	private int experience;
	private String primarySkill1;
	private String primarySkill2;
	private String primarySkill3;
	private String applicationStatus;
	
	JobRequestDetails jobId;
	
public CandidateDetails() {
	// TODO Auto-generated constructor stub
}

public CandidateDetails(int candidateId, String firstName, String lastName, String emailId, long contactNo,
		String qualification, int experience, String primarySkill1, String primarySkill2, String primarySkill3,
		String applicationStatus, JobRequestDetails jobId) {
	super();
	this.candidateId = candidateId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.contactNo = contactNo;
	this.qualification = qualification;
	this.experience = experience;
	this.primarySkill1 = primarySkill1;
	this.primarySkill2 = primarySkill2;
	this.primarySkill3 = primarySkill3;
	this.applicationStatus = applicationStatus;
	this.jobId = jobId;
}

public int getCandidateId() {
	return candidateId;
}

public void setCandidateId(int candidateId) {
	this.candidateId = candidateId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public long getContactNo() {
	return contactNo;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public int getExperience() {
	return experience;
}

public void setExperience(int experience) {
	this.experience = experience;
}

public String getPrimarySkill1() {
	return primarySkill1;
}

public void setPrimarySkill1(String primarySkill1) {
	this.primarySkill1 = primarySkill1;
}

public String getPrimarySkill2() {
	return primarySkill2;
}

public void setPrimarySkill2(String primarySkill2) {
	this.primarySkill2 = primarySkill2;
}

public String getPrimarySkill3() {
	return primarySkill3;
}

public void setPrimarySkill3(String primarySkill3) {
	this.primarySkill3 = primarySkill3;
}

public String getApplicationStatus() {
	return applicationStatus;
}

public void setApplicationStatus(String applicationStatus) {
	this.applicationStatus = applicationStatus;
}

public JobRequestDetails getJobId() {
	return jobId;
}

public void setJobId(JobRequestDetails jobId) {
	this.jobId = jobId;
}

@Override
public String toString() {
	return "CandidateDetails [candidateId=" + candidateId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", emailId=" + emailId + ", contactNo=" + contactNo + ", qualification=" + qualification + ", experience="
			+ experience + ", primarySkill1=" + primarySkill1 + ", primarySkill2=" + primarySkill2 + ", primarySkill3="
			+ primarySkill3 + ", applicationStatus=" + applicationStatus + "]";
}


}


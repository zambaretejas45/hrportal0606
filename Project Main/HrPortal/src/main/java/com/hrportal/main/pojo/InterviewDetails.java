package com.hrportal.main.pojo;

public class InterviewDetails {

	private int interviewId;
	private int aptitudeRound;
	private int technicalRound;
	private int hrRound;
	private String remarks;
	private String interviewStatus;
	EmployeeDetails interviewerId;
	CandidateDetails candidateId;
	
	public InterviewDetails() {
		// TODO Auto-generated constructor stub
	}

	public InterviewDetails(int interviewId, int aptitudeRound, int technicalRound, int hrRound, String remarks,
			String interviewStatus, EmployeeDetails interviewerId, CandidateDetails candidateId) {
		super();
		this.interviewId = interviewId;
		this.aptitudeRound = aptitudeRound;
		this.technicalRound = technicalRound;
		this.hrRound = hrRound;
		this.remarks = remarks;
		this.interviewStatus = interviewStatus;
		this.interviewerId = interviewerId;
		this.candidateId = candidateId;
	}

	@Override
	public String toString() {
		return "InterviewDetails [interviewId=" + interviewId + ", aptitudeRound=" + aptitudeRound + ", technicalRound="
				+ technicalRound + ", hrRound=" + hrRound + ", remarks=" + remarks + ", interviewStatus="
				+ interviewStatus + ", interviewerId=" + interviewerId + ", candidateId=" + candidateId + "]";
	}
	
	
	
	
}

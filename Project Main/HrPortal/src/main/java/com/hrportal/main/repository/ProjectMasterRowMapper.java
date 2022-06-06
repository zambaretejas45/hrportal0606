package com.hrportal.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hrportal.main.pojo.ProjectMaster;
@Repository
public class ProjectMasterRowMapper implements RowMapper<ProjectMaster> {

	@Override
	public ProjectMaster mapRow(ResultSet resultSet, int i) throws SQLException {
		System.out.println("in projectmaster rowmapper");
		int projectId= resultSet.getInt("PROJECT_ID");
		String projectName= resultSet.getString("PROJECT_NAME");
		LocalDate startdate = resultSet.getDate("START_DATE").toLocalDate();
		LocalDate enddate = resultSet.getDate("END_DATE").toLocalDate();
		
		ProjectMaster projectMaster = new ProjectMaster(projectId, projectName,startdate,enddate);
		System.out.println(projectMaster);
		return projectMaster;
	}
}

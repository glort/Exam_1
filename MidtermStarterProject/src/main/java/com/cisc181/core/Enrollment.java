package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID, StudentID, EnrollmentID;
	private double Grade;
	
	private Enrollment(){
		EnrollmentID = UUID.randomUUID();
	
	}
	
	public Enrollment(UUID StudentID, UUID SectionID){
		this();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	
	public double getGrade(){
		return this.Grade;
	}

}

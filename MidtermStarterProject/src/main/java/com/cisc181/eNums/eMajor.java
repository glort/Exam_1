package com.cisc181.eNums;

public enum eMajor {
	BUSINESS("Business"), COMPSI("Computer Science"), CHEM("Chemistry"), PHYSICS("Physics"), NURSING("Nursing");
	
	private String Major;
	private eMajor(final String Major){
		this.Major = Major;
	}
	
	public String getMajor(){
		return this.Major;
	}

}

package com.whitepanda.models;

public class EducationItem{
	private String toMonth;
	private String toYear;
	private String fromYear;
	private Object fromDate;
	private Object toDate;
	private String school;
	private String degree;
	private Object description;
	private String location;
	private String id;
	private String present;
	private String fromMonth;

	public void setToMonth(String toMonth){
		this.toMonth = toMonth;
	}

	public String getToMonth(){
		return toMonth;
	}

	public void setToYear(String toYear){
		this.toYear = toYear;
	}

	public String getToYear(){
		return toYear;
	}

	public void setFromYear(String fromYear){
		this.fromYear = fromYear;
	}

	public String getFromYear(){
		return fromYear;
	}

	public void setFromDate(Object fromDate){
		this.fromDate = fromDate;
	}

	public Object getFromDate(){
		return fromDate;
	}

	public void setToDate(Object toDate){
		this.toDate = toDate;
	}

	public Object getToDate(){
		return toDate;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	public void setDegree(String degree){
		this.degree = degree;
	}

	public String getDegree(){
		return degree;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setPresent(String present){
		this.present = present;
	}

	public String getPresent(){
		return present;
	}

	public void setFromMonth(String fromMonth){
		this.fromMonth = fromMonth;
	}

	public String getFromMonth(){
		return fromMonth;
	}

	@Override
 	public String toString(){
		return 
			"EducationItem{" + 
			"to_month = '" + toMonth + '\'' + 
			",to_year = '" + toYear + '\'' + 
			",from_year = '" + fromYear + '\'' + 
			",from_date = '" + fromDate + '\'' + 
			",to_date = '" + toDate + '\'' + 
			",school = '" + school + '\'' + 
			",degree = '" + degree + '\'' + 
			",description = '" + description + '\'' + 
			",location = '" + location + '\'' + 
			",id = '" + id + '\'' + 
			",present = '" + present + '\'' + 
			",from_month = '" + fromMonth + '\'' + 
			"}";
		}
}

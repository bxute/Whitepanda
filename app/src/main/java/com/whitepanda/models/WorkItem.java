package com.whitepanda.models;

public class WorkItem{
	private Object toMonth;
	private Object toYear;
	private String fromYear;
	private String fromDate;
	private Object toDate;
	private String organization;
	private String description;
	private String location;
	private String id;
	private String position;
	private String present;
	private String fromMonth;

	public void setToMonth(Object toMonth){
		this.toMonth = toMonth;
	}

	public Object getToMonth(){
		return toMonth;
	}

	public void setToYear(Object toYear){
		this.toYear = toYear;
	}

	public Object getToYear(){
		return toYear;
	}

	public void setFromYear(String fromYear){
		this.fromYear = fromYear;
	}

	public String getFromYear(){
		return fromYear;
	}

	public void setFromDate(String fromDate){
		this.fromDate = fromDate;
	}

	public String getFromDate(){
		return fromDate;
	}

	public void setToDate(Object toDate){
		this.toDate = toDate;
	}

	public Object getToDate(){
		return toDate;
	}

	public void setOrganization(String organization){
		this.organization = organization;
	}

	public String getOrganization(){
		return organization;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
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

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return position;
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
			"WorkItem{" + 
			"to_month = '" + toMonth + '\'' + 
			",to_year = '" + toYear + '\'' + 
			",from_year = '" + fromYear + '\'' + 
			",from_date = '" + fromDate + '\'' + 
			",to_date = '" + toDate + '\'' + 
			",organization = '" + organization + '\'' + 
			",description = '" + description + '\'' + 
			",location = '" + location + '\'' + 
			",id = '" + id + '\'' + 
			",position = '" + position + '\'' + 
			",present = '" + present + '\'' + 
			",from_month = '" + fromMonth + '\'' + 
			"}";
		}
}

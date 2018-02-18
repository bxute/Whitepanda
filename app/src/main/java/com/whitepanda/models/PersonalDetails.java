package com.whitepanda.models;

public class PersonalDetails{
	private String firstname;
	private String city;
	private String mobile;
	private String bio;
	private String state;
	private String headline;
	private String email;
	private String lastname;

	public void setFirstname(String firstname){
		this.firstname = firstname;
	}

	public String getFirstname(){
		return firstname;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setBio(String bio){
		this.bio = bio;
	}

	public String getBio(){
		return bio;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setHeadline(String headline){
		this.headline = headline;
	}

	public String getHeadline(){
		return headline;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setLastname(String lastname){
		this.lastname = lastname;
	}

	public String getLastname(){
		return lastname;
	}

	@Override
 	public String toString(){
		return 
			"PersonalDetails{" + 
			"firstname = '" + firstname + '\'' + 
			",city = '" + city + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",bio = '" + bio + '\'' + 
			",state = '" + state + '\'' + 
			",headline = '" + headline + '\'' + 
			",email = '" + email + '\'' + 
			",lastname = '" + lastname + '\'' + 
			"}";
		}
}

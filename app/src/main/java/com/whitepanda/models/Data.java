package com.whitepanda.models;

import java.util.List;

public class Data{

	private List<SkillsItem> skills;
	private List<PublishedArticlesItem> publishedArticles;
	private List<EducationItem> education;
	private List<WorkItem> work;
	private PersonalDetails personalDetails;

	public void setSkills(List<SkillsItem> skills){
		this.skills = skills;
	}

	public List<SkillsItem> getSkills(){
		return skills;
	}

	public void setPublishedArticles(List<PublishedArticlesItem> publishedArticles){
		this.publishedArticles = publishedArticles;
	}

	public List<PublishedArticlesItem> getPublishedArticles(){
		return publishedArticles;
	}

	public void setEducation(List<EducationItem> education){
		this.education = education;
	}

	public List<EducationItem> getEducation(){
		return education;
	}

	public void setWork(List<WorkItem> work){
		this.work = work;
	}

	public List<WorkItem> getWork(){
		return work;
	}

	public void setPersonalDetails(PersonalDetails personalDetails){
		this.personalDetails = personalDetails;
	}

	public PersonalDetails getPersonalDetails(){
		return personalDetails;
	}

	@Override
 	public String toString(){
		return 
			"Data{" + 
			"skills = '" + skills + '\'' + 
			",published_articles = '" + publishedArticles + '\'' + 
			",education = '" + education + '\'' + 
			",work = '" + work + '\'' + 
			",personal_details = '" + personalDetails + '\'' + 
			"}";
		}
}
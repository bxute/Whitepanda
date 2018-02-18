package com.whitepanda.models;

public class SkillsItem{
	private String name;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"SkillsItem{" + 
			"name = '" + name + '\'' + 
			"}";
		}
}

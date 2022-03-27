package com.settermethodandTostring;
//program using Tostring method
public class Conference {
	//declaring variables
	private int  id;
	private String name;
	//constructor
	public Conference() {
		
	}
	//setter method
	public void setId(int id) {
		this.id = id;
	}
    public void setName(String name) {
		this.name = name;
	}
   //Tostring method
@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + "]";
	}
//main method
public static void main(String[] args) {
	//object creation
	Conference conference=new Conference();
	//setting the values
	conference.setId(678);
	conference.setName("Latha");
	//print statement
	System.out.println(conference.toString());
	
	}


}

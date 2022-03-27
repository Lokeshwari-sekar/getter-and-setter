package com.setterandgettermethod;
//program using getter and setter method
public class Institute {
//declaring the variable
	private int  id;
	private String name;
//constructor 
	public Institute() {

	}
	//getter and setter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//main method
	public static void main(String[] args)
	{
		//object creation
		Institute institute=new Institute();
		//setting the values
		institute.setId(789);
		institute.setName("THILAK");
		//getting the values
		System.out.println(institute.getId());
		System.out.println(institute.getName());
	}}



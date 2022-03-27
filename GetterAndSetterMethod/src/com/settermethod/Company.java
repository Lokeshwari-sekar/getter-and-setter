package com.settermethod;
//program using setter method
public class Company {
	//variable declaration
	private int  id;
	private String name;
	//constructor creation
	public Company() {
		// TODO Auto-generated constructor stub
	}
	//setter method
	public void setId(int id) {
		this.id = id;
	}
    public void setName(String name) {
		this.name = name;
	}
    //method
    public void getInstititeDetails()
    {
    	System.out.println(id);
    	System.out.println(name);
    	
    }
    //main method
public static void main(String[] args) {
	//object creation
	Company company=new Company();
	//setting the values
	company.setId(456);
	company.setName("Disha");
	//method calling statement
	company.getInstititeDetails();

	}

}

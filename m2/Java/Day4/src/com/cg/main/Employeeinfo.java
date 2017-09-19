package com.cg.main;

public class Employeeinfo  implements IEmployee
{
	public void display() 
	{
		System.out.println("Display method");
	}

	
	public void insert() 
	{
		System.out.println("Insert method");

		
	}
	public void retrevial()
	{
		System.out.println("Return num method");
	}

	public static void main(String[] args)
	{

		Employeeinfo e=new Employeeinfo();
	        e.display();
		    e.insert();
		    e.retrevial();
	}
}

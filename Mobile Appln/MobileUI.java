package com.cg.mobile.UI;

import java.util.Scanner;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.service.IMobileService;
import com.cg.mobile.service.MobileServiceImpl;

public class MobileUI 
{
	static Scanner sc = new Scanner(System.in);
	static PurchaseDetails details=null; 
	static IMobileService service = new MobileServiceImpl();
	public static void main(String[] args) 
	{
	
		System.out.println("        MOBILE APPLICATION      ");
		System.out.println("********************************");
		
		while(true)
		{
			System.out.println("1.Enter Purchase Details");
			System.out.println("2.Get the Mobile Details");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				addPurchasedetails();
				break;
				
			case 2:
				getMobileDetails();
				break;
			case 3:
				System.exit(0);
				break;
				
 			}
		}
		
	}

	private static void getMobileDetails()
	{
		
	}

	private static void addPurchasedetails()
	{
		System.out.println("Enter Customer Name");
		String cname=sc.next();
		if(service.validateName(cname))
		{
			System.out.println("Enter mailID");
		    String mailId =sc.next();
		    if(service.validateEmail(mailId))
		    {
		    
		    	System.out.println("Enter Phone number");
		        long phoneNo =sc.nextLong();
		        String num = String.valueof(phoneNo);
		        
		        if(service.validatePhone(num))
		        {
		        	 System.out.println("Enter mobile id ");
		             int mobileId =sc.nextInt();
		             
		        
		    
		
		details = new PurchaseDetails(cname, mailId, phoneNo,mobileId);
		service = new MobileServiceImpl();
		int res=service.addPurchaseDetails(details);
		System.out.println(res+" inserted");
		
		if(res == 1)
		{
			System.out.println("Value added in database");
		}
		else
		{
			System.out.println("Value not added");
		}
		
		        }
		    }
		}
	}

}

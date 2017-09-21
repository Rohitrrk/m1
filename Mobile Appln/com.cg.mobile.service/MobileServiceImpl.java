package com.cg.mobile.service;


import java.sql.SQLException;
import java.util.regex.Pattern;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileServiceImpl implements IMobileService 
{
	IMobileDAO  dao=null;
	
		 
		public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException
		{
			    dao =  new MobileDaoImpl();
				return dao.addPurchaseDetails(p);
			
			
		}
		
		public boolean validateName(String cname)
		{
			 String pattern ="[A-Z]{1}[a-zA-Z]{2,19}";
			 if(Pattern.matches(pattern, cname))
			 {
				 return true;
			 }
			 else
			 {
				 System.out.println("Please enter the valid name");
				 return false;
			 }
			
		}
		public boolean validatEmail(String mailId)
		{
			String emailPattern = "^[?=.*A-Za-z0-9]+@[A-Za-z]{2,6}$";
			
			if(Pattern.matches(emailPattern, mailId))
			 {
				 return true;
			 }
			 else
			 {
				 System.out.println("Please enter the valid email");
				 return false;
			 }
			
		}


		
		@Override
		public boolean validatePhone(long phoneNo) {
			String phnPatt ="[0-9]{9}";
			if(Pattern.matches(phnPatt, phoneNo))
			 {
				 return true;
			 }
			 else
			 {
				 System.out.println("Please enter the valid Phone number");
				 return false;
			 }		}

		

	
		

}

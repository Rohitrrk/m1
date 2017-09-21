package com.cg.mobile.service;

import com.cg.mobile.DTO.PurchaseDetails;

public interface IMobileService 
{
	public int addPurchaseDetails(PurchaseDetails p);

	public boolean validateName(String cname);

	public boolean validateEmail(String mailId);

	public boolean validatePhone(String num);

	//boolean validatePhone(String phoneNo);

}

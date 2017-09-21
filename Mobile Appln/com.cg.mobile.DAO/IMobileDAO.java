package com.cg.mobile.dao;

import java.sql.SQLException;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;

public interface IMobileDAO 
{
	public int addPurchaseDetails(PurchaseDetails p) throws SQLException, MobileApplicationException;

}
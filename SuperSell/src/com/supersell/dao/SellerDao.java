package com.supersell.dao;

import com.supersell.exception.SellerException;
import com.supersell.model.Seller;

public interface SellerDao {

	
	public String registerSeller(String sname, String email, String address, String password)  throws SellerException;
	
	public Seller LoginSeller(String username, String password)    throws SellerException;
	
}

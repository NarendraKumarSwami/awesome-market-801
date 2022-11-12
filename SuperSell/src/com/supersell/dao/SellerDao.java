package com.supersell.dao;

import com.supersell.exception.SellerException;

public interface SellerDao {

	
	public String registerSeller(String sname, String email, String address, String password)  throws SellerException;
	
	public String LoginSeller(String username, String password)    throws SellerException;
	
}

package com.supersell.dao;

import com.supersell.exception.BuyerException;

public interface BuyerDao {
   
	
	
	public String  registerBuyer(String name, String email, String address, String password)  throws BuyerException;
	
	public String login(String username, String password) throws BuyerException; 
	
	
}

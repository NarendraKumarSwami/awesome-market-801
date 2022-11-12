package com.supersell.dao;

import java.util.List;

import com.supersell.exception.AdministratorException;
import com.supersell.exception.BuyerException;
import com.supersell.model.Buyer;

public interface AdministratorDao {
       
	
	
	public List<Buyer>  getAllBuyer() throws AdministratorException, BuyerException;
	
   
}

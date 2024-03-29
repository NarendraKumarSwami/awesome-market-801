package com.supersell.dao;

import java.util.List;

import com.supersell.exception.AdministratorException;
import com.supersell.exception.BuyerException;
import com.supersell.exception.SellerException;
import com.supersell.model.Buyer;
import com.supersell.model.Seller;

public interface AdministratorDao {
       
	
	
	public List<Buyer>  getAllBuyer() throws AdministratorException, BuyerException;
	
	
	public List<Seller>  getAllSeller() throws AdministratorException, SellerException;
    
	
}

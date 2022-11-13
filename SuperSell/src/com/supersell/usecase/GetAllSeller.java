package com.supersell.usecase;

import java.util.List;

import com.supersell.dao.AdministratorDao;
import com.supersell.dao.AdministratorDaoImpl;
import com.supersell.exception.AdministratorException;
import com.supersell.exception.SellerException;
import com.supersell.model.Seller;

public class GetAllSeller {

	public static void main(String[] args) {
		
		AdministratorDao dao = new AdministratorDaoImpl();
		
	    try {
			List<Seller> lss =	dao.getAllSeller();
			
			lss.forEach(seller -> System.out.println(seller));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
}

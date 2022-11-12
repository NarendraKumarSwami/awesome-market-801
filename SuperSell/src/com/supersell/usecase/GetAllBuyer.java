package com.supersell.usecase;

import java.util.List;

import com.supersell.dao.AdministratorDao;
import com.supersell.dao.AdministratorDaoImpl;
import com.supersell.exception.AdministratorException;
import com.supersell.exception.BuyerException;
import com.supersell.model.Buyer;

public class GetAllBuyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		AdministratorDao dao = new AdministratorDaoImpl();
		
		try {
			List<Buyer> lsb = dao.getAllBuyer();
			
			lsb.forEach(buyer -> System.out.println(buyer));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}

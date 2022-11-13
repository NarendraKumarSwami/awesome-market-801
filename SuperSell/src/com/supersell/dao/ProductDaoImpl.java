package com.supersell.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.supersell.exception.ProductException;
import com.supersell.utility.DBUtil;

public class ProductDaoImpl  implements ProductDao{

	@Override
	public String AddProduct(Sellers seller) throws ProductException {
		// TODO Auto-generated method stub
		String message = "Product is not edded";
		   
		try (Connection con = DBUtil.provideConnection()){
			    PreparedStatement ps =  con.prepareStatement("insert into ");
			    
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return message;
	}

	
	
}

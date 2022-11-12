package com.supersell.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.supersell.exception.AdministratorException;
import com.supersell.exception.BuyerException;
import com.supersell.model.Buyer;
import com.supersell.utility.DBUtil;

public class AdministratorDaoImpl   implements AdministratorDao{

	@Override
	public List<Buyer> getAllBuyer() throws AdministratorException, BuyerException {
		// TODO Auto-generated method stub
		List<Buyer>  lsb = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			  PreparedStatement  ps =   conn.prepareStatement("select * from Buyer");
			  
		      ResultSet rs =  ps.executeQuery();
		      
		      while(rs.next()) {
		    	 
		    	  lsb.add(new Buyer(rs.getInt("bid"), rs.getString("bname"), rs.getString("bemail"), rs.getString("address"), rs.getString("password")));
		    	  
		      }
		     if(lsb.size()  ==0) {
		    	 throw new AdministratorException("None Buyer");
		     }
		} catch (SQLException e) {
			// TODO: handle exception
			 // e.printStackTrace();
			throw new BuyerException(e.getMessage());
		}
		
		
		return lsb;
		
				
				
	}

}

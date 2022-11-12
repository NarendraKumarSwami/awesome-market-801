package com.supersell.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.supersell.exception.SellerException;
import com.supersell.utility.DBUtil;

public class SellerDaoImpl   implements SellerDao {

	@Override
	public String registerSeller(String sname, String semail, String address, String password) throws SellerException {
		// TODO Auto-generated method stub
		String message = "Not riegister as a seller...";
		
		try (Connection conn = DBUtil.provideConnection()){
			  PreparedStatement ps =   conn.prepareStatement("insert into seller(sname, semail, address, password) values(?, ?, ?, ?)");
			       ps.setString(1, sname);
			       ps.setString(2, semail);
			       ps.setString(3, address);
			       ps.setString(4, password);
			       
			       int x =   ps.executeUpdate();
			       if(x > 0) {
			    	   message = sname + " : is registered seccuessfully as seller";
			       }else {
			    	   throw new SellerException("Not registerd!");
			       }
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
		
		return message;
	}

	@Override
	public String LoginSeller(String username, String password) throws SellerException {
		// TODO Auto-generated method stub
		String message  = "Not Logined ...";
		
		
		try (Connection con = DBUtil.provideConnection()){
			
			  PreparedStatement   ps =  con.prepareStatement("select * from seller where semail = ? AND password = ?");
			   ps.setString(1, username);
			   ps.setString(2, password);
			   
			ResultSet rs =    ps.executeQuery();
			
			if(rs.next()) {
			    message =	rs.getString("sname") + " : is logined seccussfully";
			}else {
				throw new SellerException("Email or Password is incorrect");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return message;
	}

}

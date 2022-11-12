package com.supersell.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.supersell.exception.BuyerException;
import com.supersell.utility.DBUtil;

public class BuyerDaoImpl  implements BuyerDao{

	@Override
	public String registerBuyer(String name, String email, String address, String password)  throws BuyerException{
		// TODO Auto-generated method stub
         String message = "Not registered....";
         
         try (Connection conn = DBUtil.provideConnection()){
			   PreparedStatement  ps =  conn.prepareStatement("insert into buyer(bname, bemail, address, password) values(?, ?, ?, ?)");
		        ps.setString(1, name);
		        ps.setString(2, email);
		        ps.setString(3,  address);
		        ps.setString(4,  password);
		        
		        int x =  ps.executeUpdate();
		        if(x>0) {
		        	message = "Data inserted seccussfully";
		        }else {
		        	throw new BuyerException("Buyer is not register");
		        }
		        
         } catch (SQLException e) {
			// TODO: handle exception
			throw new BuyerException(e.getMessage());
		} 
         
         
         return message;
	}

	@Override
	public String login(String username, String password) throws BuyerException {
		// TODO Auto-generated method stub
		String message = "Not logined in";
		
		try (Connection conn = DBUtil.provideConnection()){
			 PreparedStatement  ps =  conn.prepareStatement("select * from buyer where bemail = ? AND password =?");
			 ps.setString(1, username);
			 ps.setString(2, password);
			 
			 ResultSet rs = ps.executeQuery();
			 
			 if(rs.next()) {
				 message = rs.getString("bname") +" : is seccuessfully logined";
			 }else {
				 throw new BuyerException("email or password is incorrect");
			 }
			 
		} catch (SQLException e) {
			// TODO: handle exception
			   throw new BuyerException(e.getMessage());
		}
		
		return message;
		
	}

}

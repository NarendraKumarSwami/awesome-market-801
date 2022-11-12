package com.supersell.usecase;

import java.util.Scanner;

import com.supersell.dao.BuyerDao;
import com.supersell.dao.BuyerDaoImpl;
import com.supersell.exception.BuyerException;
public class LoginBuyer {

	
	
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.println("Enter the Credentials :");
		    
		    System.out.println("Enter Your email :");
		    String username =sc.nextLine();
		    
		    
		    System.out.println("Enter Your Password :");
		    String password = sc.nextLine();
		    
		    
		    BuyerDao dao = new BuyerDaoImpl();
		    
		      try {
				String message = dao.login(username, password);
				System.out.println(message);
			} catch (BuyerException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				
				System.out.println(e.getMessage());
			}
		    
		    
		    
	}
}

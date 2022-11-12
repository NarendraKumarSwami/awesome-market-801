package com.supersell.usecase;



import java.util.Scanner;

import com.supersell.dao.SellerDao;
import com.supersell.dao.SellerDaoImpl;
import com.supersell.exception.SellerException;
public class LoginSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Details to login as Seller");
        System.out.println("Enter Email :");
        String email =  sc.nextLine();
       
        System.out.println("Enter Password :");
        String password =  sc.nextLine();
        
          SellerDao dao = new SellerDaoImpl();
          try {
			String message =  dao.LoginSeller(email, password);
			   System.out.println(message);
		} catch (SellerException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
        
        
	}

}

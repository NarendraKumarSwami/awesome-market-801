package com.supersell.usecase;


import java.util.Scanner;

import com.supersell.dao.SellerDao;
import com.supersell.dao.SellerDaoImpl;
import com.supersell.exception.SellerException;
public class RegisterSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter detials to registers as Seller");
         System.out.println("Enter YOur name :");
         String name =sc.nextLine();
         
         System.out.println("Enter Your email :");
         String email =sc.nextLine();
         
         System.out.println("Enter Your address :");
         String address =sc.nextLine();
         
         System.out.println("Enter Your password :");
         String password =sc.nextLine();
         
         
         SellerDao dao = new SellerDaoImpl();
         
          try {
			String message =  dao.registerSeller(name, email, address, password);
			System.out.println(message);
		} catch (SellerException e) {
			// TODO Auto-generated catch block
            // e.printStackTrace();
			
			System.out.println(e.getMessage());
		}
	}

}

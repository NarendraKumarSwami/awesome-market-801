package com.supersell.usecase;


import java.util.Scanner;

import com.supersell.dao.BuyerDao;
import com.supersell.dao.BuyerDaoImpl;
import com.supersell.exception.BuyerException;
public class RegisterBuyer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Details, to register as Buyer ::");
		System.out.println("Enter name :");
		String name = sc.nextLine();
		
		System.out.println("Enter email :");
		String email = sc.nextLine();
		
		System.out.println("Enter addresss :");
		String address = sc.nextLine();
		
		System.out.println("Enter password");
		String password = sc.nextLine();
		
		
		BuyerDao  dao = new BuyerDaoImpl();
		
		 try {
			String result = dao.registerBuyer(name, email, address, password);
			System.out.println(result);
		} catch (BuyerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
        
	}

}

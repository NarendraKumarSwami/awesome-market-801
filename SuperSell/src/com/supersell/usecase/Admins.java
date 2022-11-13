package com.supersell.usecase;

import java.util.Scanner;

import com.supersell.model.Admin;

public class Admins {
	
	private Admin ad;

	public Admins() {
		super();
	}
	
	public static void admin() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Login as Admin:");
		
		System.out.println("Enter Email");
		String email = sc.nextLine();
		
		System.out.println("Enter Email");
		String password = sc.nextLine();
		
		Admins.login(email, password);
	  
	}

	

	private static void login(String username, String password) {
		// TODO Auto-generated method stub
		     
		
	}

}

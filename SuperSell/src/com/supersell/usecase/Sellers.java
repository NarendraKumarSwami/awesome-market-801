package com.supersell.usecase;

import java.util.Scanner;

import com.supersell.dao.SellerDao;
import com.supersell.dao.SellerDaoImpl;
import com.supersell.exception.SellerException;
import com.supersell.model.Admin;
import com.supersell.model.Seller;

public class Sellers {

	
		private Seller sl = new Seller();
		private static Sellers sls = new Sellers();
		
		
	
		
		public static void seller() {
			System.out.println("Enter number to login or register as Seller :");
			System.out.println("1. login");
			System.out.println("2. Register");
			
			Scanner sc = new Scanner(System.in);
			
			int x = sc.nextInt();
			
			
			switch(x) 
			{
			  case 1 : {
				 sls.login();
				 break;
			  }
			  case 2 : {
				  sls.register();
				  break;
			  }
			  default : {
				  System.out.println("Oops Entered wrong number! Please try again");
				  Sellers.seller();
			  }
			}
		}

		private void register() {
			// TODO Auto-generated method stub
			 Scanner sc = new Scanner(System.in);
	         
			 
	         System.out.println("Enter detials to registers as Seller");
	         System.out.println("Enter Your name :");
	         String name =sc.nextLine();
	         sl.setSname(name);
	         
	         System.out.println("Enter Your email :");
	         String email =sc.nextLine();
	         sl.setSemail(email);
	         
	         System.out.println("Enter Your address :");
	         String address =sc.nextLine();
	         sl.setAddress(address);
	         
	         System.out.println("Enter Your password :");
	         String password =sc.nextLine();
	         sl.setPassword(password);
	         
	         
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

		private void login() {
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
		
		
		
		private void sellerOprations() {
			     System.out.println("Choose Actions to Do : ");
			     
			     Scanner sc = new Scanner(System.in);
			     
			     
			     System.out.println("1. List new product");
			     System.out.println("2. Update exitsing Product");
			     System.out.println("3. All order recived");
			     System.out.println("4. List of product in store");
			     System.out.println("5. Returned Products");
			     System.out.println("6. Summery of consumer");
			     System.out.println("7. Payments");
			      
			     int x = sc.nextInt();
			     
			     switch(x) {
			       case 1 : {
			    	    sls.addProduct();
			    	    break;
			       }
			       case 2 : {
			    	   sls.updateProduct();
			    	   break;
			       }
			       case 3 : {
			    	   sls.orderRecived();
			    	   break;
			       }
			       case 4 : {
			    	   sls.remainingProduct();
			    	   break;
			       }
			       case 5 : {
			    	   sls.returnedProduct();
			    	   break;
			       }
			       case 6 : {
			    	   sls.summeryCosumer();
			    	   break;
			       }
			       case 7 : {
			    	   sls.payments();
			    	   break;
			       }
			     
			     }
			     
		}

		
	
}

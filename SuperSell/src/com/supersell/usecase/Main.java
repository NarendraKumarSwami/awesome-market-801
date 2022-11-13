package com.supersell.usecase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("To login or reigister press the number");
         System.out.println("1. Admin");
         System.out.println("2. Seller");
         System.out.println("3. Buyer");
         
         Scanner  sc = new Scanner(System.in);
         int x = sc.nextInt();
        
         switch(x) 
         {
         case 1 :  {
        	 Admins.admin();
        	 break;
         }
         case 2 : {
        	 Sellers.seller();
        	 break;
         }
         case 3 : {
        	 Buyers.buyer();
        	 break;
         }
         
         
         }
	}

}

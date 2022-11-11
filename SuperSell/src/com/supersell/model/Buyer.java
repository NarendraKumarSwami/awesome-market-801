package com.supersell.model;

public class Buyer {
     
	
	  private int bid;
	  private String bname;
	  private String email;
	  private String address;
	  private String password;
	 
	  
	 public Buyer() {
		 super();
	 }
	  
	  
	public Buyer(int bid, String bname, String email, String address, String password) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	  
	  
}

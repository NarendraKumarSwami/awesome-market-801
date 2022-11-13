package com.supersell.model;

public class Admin {
   
	
	private int aid;
	private String aname;
	private String aemail;
	private String address;
	private String password;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
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
	public Admin(int aid, String aname, String aemail, String address, String password) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.aemail = aemail;
		this.address = address;
		this.password = password;
	}
	
	
}

package com.supersell.model;

public class Seller {

	
	private int sid;
	private String sname;
	private String semail;
	private String address;
	private String password;
	
	public Seller() {
		super();
	}
	
	public Seller(int sid, String sname, String semail, String address, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.address = address;
		this.password = password;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
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

	@Override
	public String toString() {
		return "Seller [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", address=" + address + ", password="
				+ password + "]";
	}
	
	
	
}

package com.example.model;

import java.time.LocalDate;

public class Product {
	private int pid;
	private String pname;
	private String version;
	private String type;
	private LocalDate purchase_date;
	private LocalDate warranty;
	private String location;
	
	public Product(int pid, String pname, String version, String type,LocalDate purchase_date,LocalDate warranty, 
			 String location) {
		this.pid = pid;
		this.pname = pname;
		this.version = version;
		this.type = type;
		this.purchase_date = purchase_date;
		this.warranty = warranty;
		this.location = location;
	};
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public int getPid() {
		return pid;
	}
	
	public LocalDate getPurchase_date() {
		return purchase_date;
	}

	public void setPurchase_date(LocalDate purchase_date) {
		this.purchase_date = purchase_date;
	}

	public LocalDate getWarranty() {
		return warranty;
	}

	public void setWarranty(LocalDate warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", version=" + version + ", type=" + type
				+ ", purchase_date=" + purchase_date + ", warranty=" + warranty + ", location=" + location + "]";
	}
	
	

}

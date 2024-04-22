package com.business.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String plocation;
	private double pprice;
	private String pdescription;
	private String pimage;


	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public String getPimage() { return pimage; }

	public void setPimage(String pimage) { this.pimage = pimage; }

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", plocation=" + plocation + ", pprice=" + pprice + ", pdescription=" + pdescription+ ", pimage=" + pimage
				+ "]";
	}



}

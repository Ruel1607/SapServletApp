package com.ibm.servlet.util;

import java.io.Serializable;

public class Person implements Serializable {
private static final long serialVersionUID = 6297385302078200511L;


	private int id;
	private String fullname;
	private String address;
	private String country;
	private int age;
	private double income ;
	private String work ;
	private String note ;
	private String status;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", fullname=" + fullname + ", address=" + address + ", country=" + country
				+ ", age=" + age + ", income=" + income + ", work=" + work + ", note=" + note + ", status=" + status
				+ "]";
	}

	

}

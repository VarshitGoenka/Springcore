package com.ust1.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		//System.out.println("Inside the setter method");
		this.id = id;
	}
	// this is the init() method
	public void hi() {
		System.out.println("inside Hi method()");
	}
	
	// this is the destroy method
	public void bye() {
		System.out.println("inside bye method()");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}

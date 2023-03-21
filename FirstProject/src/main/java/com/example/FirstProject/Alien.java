package com.example.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {
	private int aid;
	private String aname;
	private String atech;
	
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	
	public Alien() {
		super();
		System.out.println("creating Alien object...");
	}
	
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
	public String getAtech() {
		return atech;
	}
	public void setAtech(String atech) {
		this.atech = atech;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void showAlien() {
		System.out.println("in showAlien");
		laptop.complie();
		System.out.println(laptop.toString());
	}
	
}

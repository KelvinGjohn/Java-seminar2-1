package model;

import java.util.Set;



public class Vehicle { 
	private int id; 
	private String title; 
	private String vehicleCode; 
	private float price; 
	private EnergyType eType;
	
	private static int counter = 0;
	
	
	
	public int getid() {
		return id;
	}
	
	public String gettitle() {
		return title;
	}
	
	public String getvehicleCode() {
		return vehicleCode;
	}
	
	public float getprice () {
		return price;
	}
	
	public EnergyType geteType() {
		return eType;
	}
	
	//Setters
	
	public void setid() {
		id = counter;
		counter++;
		
	}
	

	public void settitle(String inputtitle) {
		if(inputtitle!=null) {
			title = inputtitle;
		}
		else
		{
			title  = "Unknown";
		}
	}

}


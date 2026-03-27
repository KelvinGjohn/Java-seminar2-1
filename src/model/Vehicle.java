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
		if((inputtitle!= null ) && (!inputtitle.isEmpty())
		&&(!inputtitle.matches(inputtitle))) {
			title = inputtitle;
		}
		else
		{
			title  = "Unknown";
		}
	}
	public void setVehicleCode() {
		vehicleCode = id + " " + title;
	}
	
	public void setPrice(float inputPrice) {
		if (inputPrice > 0 && inputPrice < 10000 ) {
			 price  = inputPrice; 
		}
		else {
			price = 1;
		}
		
	}
	
	public void seteType (EnergyType inputeType) {
		if(inputeType!= null) {
			eType = inputeType;
		}
		else {
			eType = EnergyType.not_specified;
		}
	}

}


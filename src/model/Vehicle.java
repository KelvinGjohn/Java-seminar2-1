package model;

import java.security.Identity;
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
		&&(inputtitle.matches("[A-Z]{1}[A-Za-z ]{4,19}"))) {
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
	public Vehicle(){
		setid();
		settitle("MB car");
		setVehicleCode();
		setPrice(2688899);
		seteType(EnergyType.hybrid);
		
	}
	public Vehicle (String inputtitle, float inputprice, EnergyType inputeType) {
		setid();
		settitle(inputtitle);
		setVehicleCode();
		setPrice(inputprice);
		seteType(inputeType);
		
	}
	//string
	
	public String toString() {
		String result = id + " " + title + "(" + vehicleCode +")" + price + " eur " + eType;
		return result;
	}
	

}


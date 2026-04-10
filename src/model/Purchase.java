package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Purchase {
	private String userCardNo;
	private ArrayList<Vehicle> shoppingList = new ArrayList<Vehicle>();
	private LocalDateTime datetime = LocalDateTime.now();
	//2.getters
	public String getUserCardNo()
	{
		return userCardNo;
	}
	public ArrayList<Vehicle> getShoppingList(){
		return shoppingList;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	
	//3.setters
	public void setUserCardNo(String inputUserCardNo) {
		if(inputUserCardNo != null && !inputUserCardNo.isEmpty()
				&& inputUserCardNo.matches("[A-Z]{2}[0-9]{5}")) {
			userCardNo = inputUserCardNo;
		}
		else
		{
			userCardNo = "AB7777";
		}
	}
	
	public void setShoppingList(ArrayList<Vehicle> inputShoppingList) {
		if(inputShoppingList != null 
				&& !inputShoppingList.isEmpty()) {
			shoppingList = inputShoppingList;
		}
		else
		{
			shoppingList = new ArrayList<Vehicle>();
		}
	}
	
	
	//4.both constructors
	public Purchase() {
		setUserCardNo("AB7777");
		
	}
	public Purchase(String inputUserCard) {
		setUserCardNo(inputUserCard);
		
	}
	//5.toString
	public String toString() {
		String result = userCardNo + " " + shoppingList + " " + datetime;
		return result;
	}
	
	
}
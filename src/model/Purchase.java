package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import service.MainService;

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
	
	public void addVehicleToShippingList(String inputVehicleCode, int quality) {
		int howManyVecFindInStore = 0;
		for(int i = 0; i < MainService.allVehiclesInStore.size(); i++) {
			Vehicle tempG = MainService.allVehiclesInStore.get(i); 
			if (tempG.getvehicleCode().equals(inputVehicleCode)) {
				MainService.allVehiclesInStore.remove(tempG);
				shoppingList.add(tempG);
				howManyVecFindInStore++;
			}
		}
		if (quality > howManyVecFindInStore) {
			System.out.println("There is no " + quality + 
					"vehicle with code " + inputVehicleCode);
		}
		else
		{
			System.out.println(inputVehicleCode);
		}
		
	}
	public void removeVehicleToShippingList(String inputVehicle) {
		
		boolean findVehicle = false;
	
		for (int i = 0; i < shoppingList.size(); i++) {
			Vehicle tempV = shoppingList.get(i);
			if (tempV.getvehicleCode().equals(inputVehicle)) {
				shoppingList.remove(i);
			
				MainService.allVehiclesInStore.add(tempV);
				findVehicle = true;
		}
	}
		if (findVehicle) {
			System.out.println("RETURN AFTER BUYING" + inputVehicle + "is removed");
			
		}
		else
		{
			System.out.println("There is no vehicles with code " 
					+ inputVehicle + " in the shopping list");
					}
				}
				
		public float calculateShoppingListValue() {
					float sum = 0;
					for(Vehicle tempV : shoppingList) {
						sum = sum + tempV.getprice();
					}
					return sum;
				}
}
				
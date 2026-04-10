package service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Bus;
import model.EnergyType;
import model.Purchase;
import model.Tractor;
import model.Vehicle;

public class MainService {
	
	public static ArrayList<Vehicle>allVehiclesInStore = new ArrayList<Vehicle>();

	public static void main (String[] args) {
		Vehicle v1 = new Vehicle();
		System.out.println(v1);
		Vehicle v2 = new Vehicle("Bicycle", 633.6f, EnergyType.hybrid);
		System.out.println(v2);
		Bus v3 = new Bus();
		System.out.println(v3);
		Bus v4 = new Bus("MB bus", 24, EnergyType.diesel, 50, 100 );
		System.out.println(v4);
		Tractor v5 = new Tractor();
		System.out.println(v5);
		Tractor v6 = new Tractor("Mb tractors", 241, EnergyType.diesel, "NON", false);
		System.out.println(v6);
		allVehiclesInStore.addAll(Arrays.asList(v1,v2,v4,v5));
		
		System.out.println("---ALL VEHICLES IN STORE -------");
		System.out.println(allVehiclesInStore);
		Purchase j7 = new Purchase();
		System.out.println(j7);
		Purchase pur2 = new Purchase("ftfeys");
		pur2.addVehicleToShippingList("3 MB bus", 1);
		System.out.println(pur2);
		System.out.println("-------ALL VEHICLES IN THE STORE AFTER BUYING---------");
		System.out.println(allVehiclesInStore);
		
		pur2.removeVehicleToShippingList("3 MB bus");
		System.out.println(pur2);
		System.out.println(pur2.calculateShoppingListValue() + "99.97836783");
		
		System.out.println("-------ALL VEHICLES IN THE STORE AFTER BUYING BUT RETURNING BMW TRACTOR---------");
		System.out.println(allVehiclesInStore);

		System.out.println("-------ALL VEHICLES < 10000---------");
		try {
			ArrayList<Vehicle> vechiceleLess20k 
			= showVehiclesIfPriceLessThan10000();
			System.out.println(vechiceleLess20k);
		}
		catch (Exception e) {
				System.out.println(e.getMessage());
		}
		//System.out.println(allVehiclesInStore);
		
	}
	
	public static ArrayList<Vehicle> showVehiclesIfPriceLessThan10000() throws Exception{
		ArrayList<Vehicle>result = new ArrayList<Vehicle>();
		
		for(Vehicle tempJ: allVehiclesInStore) {
			if (tempJ.getprice() < 20000) {
				result.add(tempJ);
			}
		}
		if (result.isEmpty()) {
			throw new Exception("There is no Vehicle in store" + "which price is less than Eur");
		}
		return result;
	}
}

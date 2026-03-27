package service;
import model.Bus;
import model.EnergyType;
import model.Tractor;
import model.Vehicle;

public class MainService {

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
		
	}
}

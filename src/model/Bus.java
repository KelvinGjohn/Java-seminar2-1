package model;

public class Bus extends Vehicle{
	private  int numberOfseat ;
	private  int BaggageDivision;
	
	
	//getters
	public int getnumberOfseat() {
		return numberOfseat;
	}
	
	public int  getBaggageDivision() {
		return BaggageDivision;
	}
	
	//setters
	public void setnumberOfseat(int inputnumberOfseat) {
		if (inputnumberOfseat > 0 && inputnumberOfseat < 25 ){
		numberOfseat = inputnumberOfseat;
		}
		else {
		numberOfseat = 7;
		}
 	}
	
	public void setBaggageDivision(int inputBagg)

	
	

	
	
	
		
	

}

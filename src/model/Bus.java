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
		if (inputnumberOfseat > 0 && inputnumberOfseat < 125 ){
		numberOfseat = inputnumberOfseat;
		}
		else {
		numberOfseat = 7;
		}
 	}
	
	public void setBaggageDivision(int inputBaggageDivision) {
		//TODO create check if inputBaggageDivision > 0 and inputBaggageDivision < 100
		BaggageDivision = inputBaggageDivision;
	}
	public Bus () {
		super();
		settitle("MB bus");
		setBaggageDivision(24);
		setnumberOfseat(60);
		
	}
	
	public Bus (String inputtitle, float inputPrice, EnergyType inputEtype, int inputNumberOfSeats, int  inputBaggage) {
		super(inputtitle, inputPrice, inputEtype);
		setnumberOfseat(inputNumberOfSeats);
		setBaggageDivision(inputBaggage);
	}
	
	public String toString() {
			String result = super.toString() + " "
		+ numberOfseat + " " + BaggageDivision;
			return result;
		}
	
	
	
	

	
	
	
		
	

}

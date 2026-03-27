package model;

public class Tractor extends Vehicle {
	private String AdditionalTechnique;
	private boolean LargeTires;
	
	//getters
	public String getAdditionalTechnique(){
		return AdditionalTechnique;
		
	}
	
	public boolean getLargeTires() {
		return LargeTires;
	}
	
	//setters 
	
	public void setAdditionalTechnique(String inputAdditionalTechnique) {
		if(inputAdditionalTechnique != null){
			AdditionalTechnique = inputAdditionalTechnique;
		}
		else
		{
			AdditionalTechnique = "non additional technique";
		}
	}
	public void setLargeTires(boolean inputLargeTires) {
		LargeTires = inputLargeTires;				
	}
	
	public Tractor() {
		super();
		setAdditionalTechnique("SPEED");
		setLargeTires(true);
	}
	
	public Tractor (String inputtitle, float inputPrice, EnergyType inputEtype, 
			String  inputAdditionalTechnique, boolean inputLargeTires) {
		super(inputtitle, inputPrice, inputEtype);
		setAdditionalTechnique(inputAdditionalTechnique);
		setLargeTires(inputLargeTires);
	

}
	
	public String toString() {
		String result = super.toString()
				+ " " + AdditionalTechnique + " " + LargeTires;
		return result;
	}
	
}

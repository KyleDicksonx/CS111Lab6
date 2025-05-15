package lab6;

public class Helicopter extends Aircraft{

	private int topSpeed;
	
	public Helicopter(String name, double altitude, int topSpeed) {
		super(name, altitude);
		this.topSpeed = topSpeed;
		
	}
	
	@Override
	public String takeOffType(){
		return "Helicopters can take off stright up";
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nYear Built: " + getYearBuilt() +
				"\nCrusing Altitude: " + getCrusingAltitude() + 
				"\nTop Speed: " + this.topSpeed;
	}
	
	
	
	
	
	
}

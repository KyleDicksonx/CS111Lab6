package lab6;
/**
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public class Helicopter extends Aircraft{
	
	/**Top speed of the Helicopter*/
	private int topSpeed;
	
	/**
	 * Non-default constructor. Calls super() and sets the value of the topSpeed instance field.
	 * @param name name of the helicopter
	 * @param altitude max altitude of the helicopter
	 * @param topSpeed top speed of the helicopter
	 */
	public Helicopter(String name, double altitude, int topSpeed) {
		super(name, altitude);
		this.topSpeed = topSpeed;
		
	}
	
	/**
	 * Returns the method that the helicopter uses to take off.
	 * @return String with info about the heli
	 */
	@Override
	public String takeOffType(){
		return "Helicopters can take off stright up";
	}
	
	/**
	 * Returns the instance fields in a nice format. 
	 * @return the instance fields. 
	 */
	@Override
	public String toString() {
		return "Name: " + name + "\nYear Built: " + getYearBuilt() +
				"\nCrusing Altitude: " + getCrusingAltitude() + 
				"\nTop Speed: " + this.topSpeed;
	}
	
	
	
	
	
	
}

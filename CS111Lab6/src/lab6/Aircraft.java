package lab6;
/**
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public abstract class Aircraft extends Vehicle{
	
	protected double crusingAltitide;
	
	public Aircraft(String name, double altitude) {
		super(name);
		this.crusingAltitide = altitude;
	}
	
	public String takeOffType() {
		return null;
	}
	
	public double getCrusingAltitude() {
		return this.crusingAltitide;
	}
	
	public void setCrusingAltitude(double altitude) {
		this.crusingAltitide = altitude;
	}
	
	
	
	
	
	
	
	
	
}

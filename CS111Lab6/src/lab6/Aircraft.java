package lab6;

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

package lab6;

public class CruiseShip extends Ship{
	protected int numPassengers;
	
	public CruiseShip(String name, int numEngines, int numPassengers) {
		super(name, numEngines);
		
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + 
				"\nYear Built: " + getYearBuilt() + 
				"\nNumber of Engines: " + getNumEngines() + 
				"\nNumber of Passengers: " + this.numPassengers;
	}
	
	
	@Override
	public String info() {
		return "There are 1764 active cruse ships in the world.\n(Note: I just made that up)";
	}
	
	
	public int getNumPassengers() {
		return this.numPassengers;
	}
	
	public void setNumPassengers(int passengers) {
		this.numPassengers = passengers;
	}
}

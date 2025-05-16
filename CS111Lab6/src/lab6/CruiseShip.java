package lab6;
/**
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public class CruiseShip extends Ship{
	
	/**The number of passengers on the ship.*/
	protected int numPassengers;
	
	/**
	 * Non-default constructor. Calls super(), and sets the value of the numPassengers instance field.
	 * @param name The name of the ship.
	 * @param numEngines The number of engines on the ship.
	 * @param numPassengers The number of passengers on the ship.
	 */
	public CruiseShip(String name, int numEngines, int numPassengers) {
		super(name, numEngines);
		this.numPassengers = numPassengers;
	}
	
	/**
	 * Returns the instance fields in a nice format. 
	 * @return The name, yearBuilt, and numPassengers instance fields.
	 */
	@Override
	public String toString() {
		return "Name: " + getName() + 
				"\nYear Built: " + getYearBuilt() + 
				"\nNumber of Engines: " + getNumEngines() + 
				"\nNumber of Passengers: " + this.numPassengers;
	}
	
	/**
	 * Returns some random info about cruise ships.
	 * @return A random made up fact about cruise ships.
	 */
	@Override
	public String info() {
		return "There are 1764 active cruse ships in the world.\n(Note: I just made that up)";
	}
	
	/**
	 * Getter method for the numPassengers instance field.
	 * @return numPassengers instance field.
	 */
	public int getNumPassengers() {
		return this.numPassengers;
	}
	
	/**
	 * Setter for the numPassengers instance field.
	 * @param passengers count
	 */
	public void setNumPassengers(int passengers) {
		this.numPassengers = passengers;
	}
}

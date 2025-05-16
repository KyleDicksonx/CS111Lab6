package lab6;
/**
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public abstract class Ship extends Vehicle{
	
	/**The number of engines the ship has.*/
	protected int numEngines;
	
	/**
	 * Non-defult constructor. Calls super() and sets the value of the numEngines instance field.
	 * @param name Name of the ship
	 * @param numEngines The number of engines the ship has.
	 */
	public Ship(String name, int numEngines) {
		super(name);
		this.numEngines = numEngines;
	}
	
	/**
	 * Returns a random fact about ships.
	 * @return A string with a fact about ships.
	 */
	public String info() {
		return "Ships float on water. \nMost of the time...";
	}
	
	/**
	 * Getter method for the numEngines instance field.
	 * @return numEngines instance field.
	 */
	public int getNumEngines() {
		return this.numEngines;
	}
	
	/**
	 * Setter method for the numEngines instance field. 
	 * @param numEngines The number of engines the ship has.
	 */
	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}	
}

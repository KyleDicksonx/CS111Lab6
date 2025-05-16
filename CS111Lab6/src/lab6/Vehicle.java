package lab6;
/**
 * Kyle Dickson
 * 50116781
 * I pledge that this submission is solely my work, and that I have neither given, nor received help from anyone.
 */
public abstract class Vehicle {
	
	/**The name of the vehicle.*/
	protected String name;
	/**The year the vehicle was built.*/
	private int yearBuilt;
	
	/**
	 * Non-default constructor, calls super().
	 * @param name
	 */
	public Vehicle(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the instance fields in a nice format. 
	 * @return The name and yearBuilt instance fields.
	 */
	public String toString() {	
		return "Name: " + this.name + ", Year Built: " + this.yearBuilt;
	}
	
	/**
	 * Getter method for the name  instance field
	 * @return the name instance field
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Setter method for the name instance field.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter method for the yearBuilt instance field.
	 * @return The yearBuilt instance field
	 */
	public int getYearBuilt() {
		return this.yearBuilt;
	}
	
	/**
	 * Setter method for the yearBuilt instance field.
	 * @param yearBuilt
	 */
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
}




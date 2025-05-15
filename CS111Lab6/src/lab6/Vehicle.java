package lab6;

public abstract class Vehicle {
	protected String name;
	private int yearBuilt;
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		
		return "Name: " + this.name + ", Year Built: " + this.yearBuilt;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getYearBuilt() {
		return this.yearBuilt;
	}
	
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	
}




package lab6;

public abstract class Ship extends Vehicle{
	
	protected int numEngines;
	
	public Ship(String name, int numEngines) {
		super(name);
		this.numEngines = numEngines;
	}
	
	
	public String info() {
		return "Ships float on water. \nMost of the time...";
	}
	
	public int getNumEngines() {
		return this.numEngines;
	}
	
	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}
	
	
	
	
	
	
	
}

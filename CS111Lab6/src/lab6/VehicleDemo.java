package lab6;

public class VehicleDemo {
	
	/**
	 * Creates 3 objects of both type CruseShip and Helicopter and prints their info.
	 * @param args
	 */
	public static void main(String[] args) {
		
		//3 objects of type CruseShip
		CruiseShip ship1 = new CruiseShip("Quaker Oats Express", 12, 11261);
		CruiseShip ship2 = new CruiseShip("The Raines Rowboat", 4, 1000);
		CruiseShip ship3 = new CruiseShip("The Land Rover", 7, 2364);
		
		//3 objects of type Helicopter
		Helicopter heli1 = new Helicopter("Totally a Tank", 17500.0, 457);
		Helicopter heli2 = new Helicopter("Republic Gunship", 22256.0, 237);
		Helicopter heli3 = new Helicopter("Star Desroyer", 300_000_000.0, 100_000);
		
		//sets the yearBuilt for the ships
		ship1.setYearBuilt(1901);
		ship2.setYearBuilt(1999);
		ship3.setYearBuilt(3025);
		
		//sets the yearBuilt for the helis
		heli1.setYearBuilt(1940);
		heli2.setYearBuilt(2012);
		heli3.setYearBuilt(2929);
		
		//array of type Vehicle containing all the ship  and heli objects
		Vehicle[] vehicles = {ship1, ship2, ship3, heli1, heli2, heli3};
		
		//prints out the info for all items in  the vehicles array
		for (Vehicle x : vehicles) {
			//System.out.println("==================");
			System.out.println(x);
			System.out.println("==================");
		}
		
		//calls the info method from CruseShip
		System.out.println(ship1.info());
		
		//calls the takeOffType from Helicopter
		System.out.println(heli1.takeOffType());	
	}	
}

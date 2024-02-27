package Utils;

import java.util.ArrayList;
import java.util.List;

public class ParkingLott {
	  private int numFloors;
	    private int numSpacesPerType;
	    private List<Floor> floors;

	    public ParkingLott(int numFloors, int numSpacesPerType) {
	        this.numFloors = numFloors;
	        this.numSpacesPerType = numSpacesPerType;
	        this.floors = new ArrayList<>();

	        for (int i = 1; i <= numFloors; i++) {
	            floors.add(new Floor(i, numSpacesPerType));
//	            System.out.println("floors adding");
	        }
	    }

	 
	    public void addVehicle(Vehicle vehicle) {
	    	  
	        for (Floor floor : floors) {
	            if (floor.checkAvailability(vehicle.getVehicleType())) {
//	            	System.out.println("space adding from main");
	                VehicleSpace space = floor.addVehicle(vehicle);
	                System.out.println("Vehicle parked at Floor " + floor.getFloorNumber() + ", Space " + space.getSpaceNumber());
	                return;
	            }
	        }
	        System.out.println("Parking is full!");
	    }

	    
	    public void removeVehicle(String registrationNumber) {
	        for (Floor floor : floors) {
	            floor.removeVehicle(registrationNumber);
	        }
	        System.out.println("Vehicle with registration number " + registrationNumber + " removed from parking lot.");
	    }

	   
	    public boolean checkAvailability(int floorNumber, TypeEnum type) {
	        return floors.get(floorNumber - 1).checkAvailability(type);
	    }
	    
	   
}

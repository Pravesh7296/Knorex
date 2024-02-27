package Utils;

import java.util.List;

public class VehicleSpace {
     int spaceNumber;
     boolean available;
     TypeEnum vehicleType;
     Vehicle vehicle;
     
	
	public VehicleSpace(int spaceNumber, TypeEnum vehicleType) {
		
		this.spaceNumber = spaceNumber;
		
		this.vehicleType = vehicleType;
		
	}
	public int getSpaceNumber() {
		return spaceNumber;
	}
	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public TypeEnum getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(TypeEnum vehicleType) {
		this.vehicleType = vehicleType;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicles(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
     
     
 
     
}

package ParkingLot;

import Utils.ParkingLott;
import Utils.TypeEnum;
import Utils.Vehicle;

public class Main {
	 public static void main(String[] args) {
	        ParkingLott parkingLot = new ParkingLott(2, 2);

	        Vehicle car1 = new Vehicle("ABC123", TypeEnum.CAR, "Red");
	        parkingLot.addVehicle(car1);
	         
	        // Adding Truck on space {because every space contains 4 vehicle}
            Vehicle truck1 = new Vehicle("Truck123",TypeEnum.TRUCK,"Green");
            parkingLot.addVehicle(truck1);
            
            
	        Vehicle car2 = new Vehicle("ABC124", TypeEnum.CAR, "Blue");
	        parkingLot.addVehicle(car2);
	        
	        Vehicle car3 = new Vehicle("ABC125", TypeEnum.CAR, "Green");
	        parkingLot.addVehicle(car3);
	        
	        Vehicle car4 = new Vehicle("ABC126", TypeEnum.CAR, "Grey");
	        parkingLot.addVehicle(car4);
	        
	        Vehicle car5 = new Vehicle("ABC127", TypeEnum.CAR, "pink");
	        parkingLot.addVehicle(car5);
	        
	        

	        parkingLot.removeVehicle("ABC123");
	        
	        parkingLot.addVehicle(car4);
	        
	      parkingLot.checkAvailability(2, TypeEnum.CAR);
              
	        parkingLot.viewCost(2, TypeEnum.BIKE);

	    }
}

package Utils;

import java.util.ArrayList;
import java.util.List;

public class Floor {
          int floorNumber;
          public List<VehicleSpace> spaces;
          
          public Floor(int floorNumber, int numSpacesPerType) {
              this.floorNumber = floorNumber;
              this.spaces = new ArrayList<>();

             
              for (int i = 1; i <= numSpacesPerType; i++) {
                  spaces.add(new VehicleSpace(i, TypeEnum.CAR));
                  spaces.get(spaces.size()-1).setAvailable(true);
                  spaces.add(new VehicleSpace(i, TypeEnum.BIKE));
                  spaces.get(spaces.size()-1).setAvailable(true);
                  spaces.add(new VehicleSpace(i, TypeEnum.TRUCK));
                  spaces.get(spaces.size()-1).setAvailable(true);
                  spaces.add(new VehicleSpace(i, TypeEnum.BUS));
                  spaces.get(spaces.size()-1).setAvailable(true);
                  
//                  System.out.println("space adding");
              }
//              System.out.println(spaces.get(1).isAvailable());
          }

          
          public int getFloorNumber() {
			return floorNumber;
		}


		public void setFloorNumber(int floorNumber) {
			this.floorNumber = floorNumber;
		}


		public List<VehicleSpace> getSpaces() {
			return spaces;
		}


		public void setSpaces(List<VehicleSpace> spaces) {
			this.spaces = spaces;
		}


		public boolean checkAvailability(TypeEnum type) {
			
              for (VehicleSpace space : spaces) {
                  if (space.getVehicleType() == type && space.isAvailable()) {
                	 
                      return true;
                  }
              }
              return false;
          }

         
          public VehicleSpace addVehicle(Vehicle vehicle) {
        	 
              for (VehicleSpace space : spaces) {
            	  
//            	  System.out.println("space loop running");
            	  
                  if (space.getVehicleType() == vehicle.getVehicleType() && space.isAvailable()) {
                	  space.setVehicles(vehicle);
                      space.setAvailable(false);
                      return space;
                  }
              }
              return null;
          }

          
          public void removeVehicle(String registrationNumber) {
              for (VehicleSpace space : spaces) {
            	  if (!space.isAvailable() && space.getVehicle().getRegNumber().equals(registrationNumber)) {
                      space.setAvailable(true);
                      return;
                  }
                  
              }
          }
}

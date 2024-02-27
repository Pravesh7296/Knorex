package Utils;

public class Vehicle {
 String regNumber ;
 TypeEnum vehicleType;
 String color;
public Vehicle(String regNumber, TypeEnum vehicleType, String color) {
	super();
	this.regNumber = regNumber;
	this.vehicleType = vehicleType;
	this.color = color;
}
public Vehicle() {
	
}
public String getRegNumber() {
	return regNumber;
}
public void setRegNumber(String regNumber) {
	this.regNumber = regNumber;
}
public TypeEnum getVehicleType() {
	return vehicleType;
}
public void setVehicleType(TypeEnum vehicleType) {
	this.vehicleType = vehicleType;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Vehicle [regNumber=" + regNumber + ", vehicleType=" + vehicleType + ", color=" + color + "]";
}
 
}

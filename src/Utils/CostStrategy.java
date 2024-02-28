package Utils;

public class CostStrategy {
  int hours;
  TypeEnum type;
public CostStrategy(int hours, TypeEnum type) {
	super();
	this.hours = hours;
	this.type = type;
}
public static int viewCost(int hour, TypeEnum type) {
	if(type.BIKE.equals(type)) {
		return hour*10;
	}else if(type.CAR.equals(type)) {
		return hour*20;
	}else if(type.TRUCK.equals(type)) {
		return hour*30;
	}else if(type.BUS.equals(type)){
		return 30*hour;
	}else {
		return 0;
	}
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public TypeEnum getType() {
	return type;
}
public void setType(TypeEnum type) {
	this.type = type;
}
  
  
}


public class Car extends Vehicle {


	public String engine;
	public boolean MOT;
	public String regPlate;
	
	public Car(int ID, String make, String model, int year, String colour, int numberOfWheels, String engine, String regPlate) {
		
		this.getTimeTaken();
		this.getBill();
		this.isFixed();
		
	}
	
	public boolean isMOT() {
		return MOT;
	}

	public void setMOT(boolean mOT) {
		MOT = mOT;
	}
	
	
}

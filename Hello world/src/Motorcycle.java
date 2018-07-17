
public class Motorcycle extends Vehicle {
	

	public String regPlate;
	public String chain;
	public String type;
	
	Motorcycle(int ID, String make, String model, int year, String colour, int numberOfWheels, String regPlate) {
		
		this.getTimeTaken();
		this.getBill();
		this.isFixed();
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

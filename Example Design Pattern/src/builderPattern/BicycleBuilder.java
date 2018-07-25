package builderPattern;

public class BicycleBuilder {

	public String newMake = "N/a";
	public String newModel = "N/a";
	public String newFrame = "N/a";
	public String newForks = "N/a";
	public String newHandlebars = "N/a";
	public String newType = "N/a";
	public String newBrakes = "N/a";
	
	public BicycleBuilder() {
	}
	
	public BicycleBuilder setNewMake(String newMake) {
		this.newMake = newMake;
		return this;
	}


	public BicycleBuilder setNewModel(String newModel) {
		this.newModel = newModel;
		return this;
	}


	public BicycleBuilder setNewFrame(String newFrame) {
		this.newFrame = newFrame;
		return this;
	}


	public BicycleBuilder setNewForks(String newForks) {
		this.newForks = newForks;
		return this;
	}


	public BicycleBuilder setNewHandlebars(String newHandlebars) {
		this.newHandlebars = newHandlebars;
		return this;
	}


	public BicycleBuilder setNewType(String newType) {
		this.newType = newType;
		return this;
	}


	public BicycleBuilder setNewBrakes(String newBrakes) {
		this.newBrakes = newBrakes;
		return this;
	}
	
	public Bicycle createNewBike() {
		
		return new Bicycle(newMake, newModel, newFrame, newForks, newHandlebars, newType, newBrakes);
	}
		
		

}

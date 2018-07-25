package builderPattern;

public class Main {
	
	public static void main(String[] args) {
		
		
		Bicycle b = new BicycleBuilder().setNewMake("whatever").setNewFrame("cddfd").createNewBike();
		
		System.out.println(b.forks);
		
	}

}


public class App {
	
	public static void main(String[] args) {
		
		Level1Methods.helloWorld();
		
		Level1Methods.assignment();
		
		Level1Methods.parameters("Hello WORLDY");
		
		System.out.println(Level1Methods.returnTypes());
		
		System.out.println(Level1Methods.paramop1(4,5));
		
		System.out.println(Level1Methods.conditionals1(6,5, false));
		System.out.println(Level1Methods.conditionals1(6,5, true));
		
		System.out.println(Level1Methods.conditionals2(6,0));
		System.out.println(Level1Methods.conditionals2(6,3));
		Level1Methods.iteration(6,3,7);
		Level1Methods.array();
		Level1Methods.arrayIteration();
		
		System.out.println();
		
		Level1Methods.arrayIteration2();
		System.out.println(Level2Methods.blackjack(15,22));
		System.out.println(Level2Methods.unique(2, 2, 3));
	}
	
}

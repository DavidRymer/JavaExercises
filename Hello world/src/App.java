import java.util.ArrayList;

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
		System.out.println(Level2Methods.unique(2, 3, 2));
		System.out.println(Level2Methods.tooHot(91, false));
	
		Person john = new Person("John",31, "Accountant");
		Person david = new Person("David",21, "IT Consultant");
		Person pablo = new Person("Pablo", 26, "Sales");
		
		System.out.println(john.toString());
		System.out.println(david.toString());
		System.out.println(pablo.toString());
		
		
		ArrayList<Person> objects = new ArrayList<>();
		objects.add(john);
		objects.add(david);
		objects.add(pablo);
		

		for (Person object : objects) {
			
			System.out.println(objects.toString());
			
		}
		
		System.out.println(Person.search("John", objects));
		

	}
	
}

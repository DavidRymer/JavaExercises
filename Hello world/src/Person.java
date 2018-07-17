import java.io.*;
import java.util.*;
public class Person {
	
	public String name;
	public int age;
	public String jobTitle;
	
	public Person(String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		
	}
	
	public String toString() {
		
		return "name: " + name + "\n" +"age: " + age + " \n" + "job title : " + jobTitle +"\n";
		
	}
	
	public static Person search(String name, ArrayList<Person> objects) {
	
		
		for (Person object : objects) {
			
			if (object.name.equals(name)) {
				
				return object;
			}
		}
		
		return null;
	}
	
}

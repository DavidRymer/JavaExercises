
public class Level1Methods {
	
	public static void helloWorld() {
		
	    System.out.println("Hello World");
	}
			
    public static void assignment() {
		
		System.out.println("Hello World");
    }
    
    public static void parameters(String word) {
		
  		System.out.println(word);
    }
    
    public static String returnTypes() {
    	
    	return "Hello World";
    	
    }
    
    public static int paramop1(int a, int b) {
    	
    	return a + b;
    }
    
    public static int conditionals1(int a, int b, boolean c) {
    	
    	if (c == true) {
    		
    		return a + b;
    	}
    	
    	else {
    		
    		return a*b;
    	}
    	
    }
    
    public static int conditionals2(int a, int b) {
    	
    	if (a == 0) {
    		
    		return b;
    	}
    	
    	else if(b == 0) {
    		
    		return a;
    	}
    	
    	else {
    		
    		return a + b;
    	}

    	
    }
    
    public static void iteration(int a, int b, int i) {
    	
    	for (int j = i; j < 10; j++) {
    		
    		System.out.println(conditionals2(a, b));
    	}
    	
    	
    }
    
    public static void array() {
    	
    	int[] a = {0,1,2,3,4,5,6,7,8,9};
    	
    	for(int i = 0; i< a.length -1; i++) {
    		
    		System.out.println(conditionals2(a[i], a[i+1]));
    		
    	}
    	
    }
    
    public static void arrayIteration() {
    	
    	int[] a = {0,1,2,3,4,5,6,7,8,9};
    	
    	for (int i = 0; i < a.length; i++) {
    		
    		System.out.print(a[i] + " ");
    	}
    	
    }
    
    public static void arrayIteration2() {
    	
    	int[] a = new int[10];
    	
    	for (int i = 0; i < a.length; i++) {
    		
    		a[i] = i;
    		System.out.println(a[i]);
    	}
    	
    	for (int i = 0; i < a.length; i++) {
    		
    		a[i] = 10 * a[i];
    		System.out.println(a[i]);
    	}
    	
    	
    	
    }
    

	
}


public class Level2Methods {
	
	public static int blackjack(int a, int b) {
		
		
		if (a > b && a <= 21 && b <=21) {
			
			return a;
		}
		
		else if (b > a && b <= 21 && a <=21) {
		
			return b;
		}
		
		else if (a <=21 && b > 21){
		
			return a;
		}
		
		else if (b <=21 && a > 21){
			
			return a;
		}
		
		else if (a == b && a<=21 && b<=21) {
			
			return a;
		}
		
		else {
			
			return 0;
		}
		
	}
	
	public static int unique(int a, int b, int c) {
		
		int array[] = {a, b, c};
			
		for (int i =0; i < array.length-1; i++) {
			if (array[i] == array[i+1]) {
				
				array[i] = 0;
				array[i+1] = 0;
			}
		}
		
		for (int i =0; i < array.length - 2; i++) {
			if (array[i] == array[i+2]) {
				
				array[i] = 0;
				array[i+2] = 0;
			}
		}
		
		return array[0] + array[1] + array[2];

	}

	public static boolean tooHot(int temp, boolean isSummer) {
		
		if (isSummer == true && temp > 60 && temp <100) {
			
			return true;
		}
		
		else if (isSummer == true && temp <= 60 || temp >= 100) {
			
			return false;
		}
		
		else if (isSummer == false && temp > 60 && temp <90) {
			
			return true;
		}
		
		else {
			
			return false;
		}
		
	}

}

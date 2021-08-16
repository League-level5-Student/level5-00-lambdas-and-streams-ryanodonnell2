package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
		
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String build = "";
			for(int i = s.length()-1; i >= 0; i--) {
				build += s.charAt(i);
			}
			System.out.println(build);
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String build = "";
			for(int i = 0; i < s.length(); i++) {
				String letter = "";
				letter += s.charAt(i);
				if(i%2 == 0) {
					build += letter.toLowerCase();
				}
				else {
					build += letter.toUpperCase();
				}
			}
			System.out.println(build);
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String build = "";
			for(int i = 0; i < s.length(); i++) {
				build += s.charAt(i);
				if(i!= s.length()-1) {
					build += ".";
				}
			}
			System.out.println(build);
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String build = "";
			for(int i = 0; i < s.length(); i++) {
				if("aeiou".indexOf(s.charAt(i)) < 0) {
					build += s.charAt(i);
				}
			}
			System.out.println(build);
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	

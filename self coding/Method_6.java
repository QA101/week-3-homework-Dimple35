import java.util.*;
public class Method_6 {
	public static void main(String[] args) {
		// Write a method which takes as input as a one number and returns the reverse of
		// a number.
		// 
				Scanner console = new Scanner(System.in);
				System.out.println("Enter a number:");
				int number = console.nextInt();
				String rv=Reverse(number);
				System.out.println(rv);  
				
			}
			
			public static String Reverse(int n){
					String rev = "";
					for(int i=n;i>=1;i--){
					String r = Integer.toString(i);
					rev = rev+r;
					
				}

			return rev;
				
			}

}


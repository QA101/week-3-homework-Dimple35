import java.util.*;
public class Method_5 {
	public static void main(String[] args) {
		// Write a method which takes as input as a one number and returns the product of
		// a number.
		// 
				Scanner console = new Scanner(System.in);
				System.out.println("Enter a number:");
				int number = console.nextInt();
				int num=Product(number);
				System.out.println(num);  
				
			}
			
			public static int Product(int n){
					int proNumber = 1;
					for(int i=1;i<=n;i++){
					proNumber *= i;
					
				}

			return proNumber;
				
			}

}

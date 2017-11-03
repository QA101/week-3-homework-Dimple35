import java.util.*;
	public class Method_4 {
			
			public static void main(String[] args) {
			// Write a method which takes as input as a one number and returns the sum of a
			// number.
			// 
					Scanner console = new Scanner(System.in);
					System.out.println("Enter a number:");
					int number = console.nextInt();
					int num=Sum(number);
					System.out.println(num);  
					
				}
				
				public static int Sum(int n){
						int sumNumber = 0;
						for(int i=1;i<=n;i++){
						sumNumber += i;
						
					}

				return sumNumber;
					
				}

			}







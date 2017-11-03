import java.util.Scanner;
import java.util.*;
   
	public class Method_9 {
		
			public static void main(String[] args) {
				// 9. Write a method which takes as input as a two number and returns the minimum
				// of the two.
						Scanner console = new Scanner(System.in);
						System.out.println("Enter 1st number:");
						int number1 = console.nextInt();
						System.out.println("Enter 2nd number:");
						int number2 = console.nextInt();
						String s=Min(number1, number2);
						System.out.print("Minimum:"+s);  
						
						
					}
					
					public static String Min(int n1, int n2){
							String s;
							
							if (n1<n2) {
								s=Integer.toString(n1);
							}
							else if (n1==n2) {
									s="Numbers are equal";
								}
								else {
								
								s=Integer.toString(n2);
							}
							
							
						return s;
						
					}

		}




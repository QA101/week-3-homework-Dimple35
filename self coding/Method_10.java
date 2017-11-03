import java.util.Scanner;
import java.util.*;
	
	public class Method_10 {
	
	   					
				public static void main(String[] args) {
					// 10. Write a method which takes as input as a one number and returns the factorial of
					// a number.
							Scanner console = new Scanner(System.in);
							System.out.println("Enter a number:");
							int number = console.nextInt();
							
							String s=Fact(number);
							System.out.print("Factorial:"+s);  
							
							
						}
						
						public static String Fact(int n){
								String s;
								int factorial=1;
								for (int i=n; i>=2; i--) {
									factorial *=i;
								}
								s=Integer.toString(factorial);
								
								
								
								
							return s;
							
						}

			}




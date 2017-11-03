import java.util.Scanner;
import java.util.*;
	
		public class Method_12 {
				
				public static void main(String[] args) {
					// 12. Write a method which takes as input as a three number and returns the minimum
					// of the three.
									Scanner console = new Scanner(System.in);
									System.out.println("Enter 1st number:");
									int number1 = console.nextInt();
									System.out.println("Enter 2nd number:");
									int number2 = console.nextInt();
									System.out.println("Enter 3rd number:");
									int number3 = console.nextInt();
									
									String s=Min(number1, number2, number3);
									System.out.print("Minimum:"+s);  
									
									
								}
								
								public static String Min(int n1, int n2, int n3){
										String s;
										int minimum;
										if (n1 > n2)  {
											if (n2 > n3) {
											minimum = n3;
											}
											else {
												minimum = n2;
											}
										}
										else {
											if (n1 > n3) {
											minimum = n3; }
										else {
											minimum = n1;
											
											
											}
										}
										
										
										
										s=Integer.toString(minimum);
										
								return s;
									
								}

					}








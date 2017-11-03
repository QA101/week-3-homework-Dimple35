import java.util.Scanner;
import java.util.*;
	public class Method_11 {
			
			public static void main(String[] args) {
				// 11. Write a method which takes as input as a three number and returns the
				// maximum of the three.
								Scanner console = new Scanner(System.in);
								System.out.println("Enter 1st number:");
								int number1 = console.nextInt();
								System.out.println("Enter 2nd number:");
								int number2 = console.nextInt();
								System.out.println("Enter 3rd number:");
								int number3 = console.nextInt();
								
								String s=Max(number1, number2, number3);
								System.out.print("Maximum:"+s);  
								
								
							}
							
							public static String Max(int n1, int n2, int n3){
									String s;
									int maximum;
									if (n1 < n2)  {
										if (n2 < n3) {
										maximum = n3;
										}
										else {
											maximum = n2;
										}
									}
									else {
										if (n1 < n3) {
										maximum = n3; }
									else {
										maximum = n1;
										
										
										}
									}
									
									
									
									s=Integer.toString(maximum);
									
							return s;
								
							}

				}






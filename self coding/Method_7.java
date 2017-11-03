import java.util.Scanner;
import java.util.*;
public class Method_7 {
	public static void main(String[] args) {
		// 7. Write a method which takes as input as a two number and returns swap of
		// numbers.
		// 
				Scanner console = new Scanner(System.in);
				System.out.println("Enter 1st number:");
				int number1 = console.nextInt();
				System.out.println("Enter 2nd number:");
				int number2 = console.nextInt();
				String s=Swap(number1, number2);
				System.out.print(s);  
				
				
			}
			
			public static String Swap(int n1, int n2){
					int temp;
					temp = n1;
					n1 = n2;
					n2 = temp;
					String s1=Integer.toString(n1);
					String s2=Integer.toString(n2);
					String s=s1+","+s2;
				return s;
				
			}

}

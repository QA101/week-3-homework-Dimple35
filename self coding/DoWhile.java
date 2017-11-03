import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		/* 
		 * Write a program using Do while Loop.
1) Write a java program to print first 10 numbers.
2) Write a java program to print first 5 Even numbers. EX: 2 4 6 8 10
3) Write a java program to print first 5 odd numbers. EX: 1 3 5 7 9
4) Write a java program to print first 10 square numbers.
5) Write a java program to print first 10 cube numbers.
6) Write a java program to print sum of first 5 numbers.
7) Write a java program to find sum of a number and take input from the user.
8) Write a java program to find product of a number and take input from the user.
9) Write a java program to find reverse a number and take input from the user.
10) Write a java program to find sum of first 5 even numbers. Ex: 2+4+6+8+10 = 30
		 */
//    1
/*		int i=1;
		do {
			
			System.out.println(i);
			i++;	
		} while (i<11);
			
*/
//    2	
/*		int i=2;
		do {
			System.out.println(i);
			i+=2;
		
		} while (i<11);
			
*/
//    3
/*		int i=1;
		do {
			System.out.println(i);
			i+=2;
		} while (i<11);
*/			
		

//     4
/*		int i=1;
		do {
		System.out.println(i*i); 
			i++;
		} while (i<11);
			
		 
*/
//     5
/*		int i=1;
 *      do {
 *      	System.out.println(i*i*i);
			i++;
		
		} while (i<11);
		
*/
//     6
/*		int i=1;
		int sum = 0;
		do { 
		sum = sum + i;
			i++;
		} while (i<6);
				
		System.out.println("Sum:"+sum);
*/
//     7
/*		Scanner console = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the numbers(999 for finishing:)");
		int number = console.nextInt();
		do {
			sum+=number;
			number = console.nextInt();
		} while (number != 999);
			
		System.out.println("Sum:"+sum);
*/
//     8
/*		Scanner console = new Scanner(System.in);
		int product = 1;
		System.out.println("Enter the numbers(999 for finishing:)");
		int number = console.nextInt();
		do {
			product*=number;
			number = console.nextInt();
		} while (number != 999);
			
		System.out.println("Product:"+product);
*/
//     9
/*		Scanner console = new Scanner(System.in);
		int i = 0;
		System.out.println("How many numbers do you want to enter:");
		int arraySize = console.nextInt();
		int j = arraySize-1;
		int [] reverseArray = new int [arraySize];
		System.out.println("Enter the numbers:");
		int number = 0;
		do {
			number = console.nextInt();
			reverseArray[i]=number;
			i++;
		} while (i < arraySize);
			
		do {
			System.out.print(reverseArray[j]+" ");
			j--;
		} while (j >= 0);
			
		
*/
//    10
/*		int i=2;
		int sum = 0;
		do {
			System.out.print(i+"+");
			sum = sum + i;
			i+=2;
		} while (i<=10);
			
		System.out.print("="+sum);
	*/
	}

}

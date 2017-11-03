import java.util.Scanner;
public class Method_2 {
	
	public static void main(String[] args) {
	// 2. Write a method which takes as input as a one number and returns first ten odd
	//	numbers.
	// Ex: If the number is 8 then {9, 11, 13, 15, 17, 19, 21, 23, 25, 27} will be printed.
			Scanner console = new Scanner(System.in);
			System.out.println("Enter a number:");
			int number = console.nextInt();
			int[] res = OddNumber(number);
			    for(Integer num : res)
			        System.out.println(num);  
			
		}
		
		public static int[] OddNumber(int n){
			
			int count = 0;
			int count2 = 0;
			if (n%2==0) { 
				count = n+1;
				
			}
			else {
				count = n;
			}
			int [] numbers = new int[10];	
			for(int i=1;i<=10;i++){
				numbers[count2] = count;
				count2++;
				count+=2;
			}

		return numbers;
			
		}

	}



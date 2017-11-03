import java.util.Scanner;
public class Method_3 {
		
		public static void main(String[] args) {
		// Write a method which takes as input as a one number and returns first seven
		// square numbers.
		// 
				Scanner console = new Scanner(System.in);
				System.out.println("Enter a number:");
				int number = console.nextInt();
				int[] res = SquareNumber(number);
				    for(Integer num : res)
				        System.out.println(num);  
				
			}
			
			public static int[] SquareNumber(int n){
				
				int count = 0;
				
				int [] numbers = new int[7];	
				for(int i=1;i<=7;i++){
					numbers[count] = n*n;
					count++;
					n++;
				}

			return numbers;
				
			}

		}





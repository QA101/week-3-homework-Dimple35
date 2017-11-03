import java.util.*;
public class Method_1 {

	public static void main(String[] args) {
// 1. Write a method which takes as input as a one number and returns even
// numbers to that number.
// if the number is 5 then 2, 4, 6, 8, 10 should be return
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = console.nextInt();
		int[] res = EvenNumber(number);
		    for(Integer num : res)
		        System.out.println(num);  
		
	}
	
	public static int[] EvenNumber(int n){
		int [] numbers = new int[n];
		int count = 0;
		for(int i=1;i<=n;i++){
			numbers[count] = 2*i;
			count++;
		}

	return numbers;
		
	}

}

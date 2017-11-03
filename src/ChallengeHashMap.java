import java.util.*;
public class ChallengeHashMap {

	public static void main(String[] args) {
// 1) Write a program which takes input as 7 students and their score.
/*		Map<String, String> studentMap = new HashMap<String, String>();
		Scanner console = new Scanner(System.in);
		String name;
		String score;
		for (int i=1; i<=7; i++) {
			System.out.println(i+"- Enter the student's name and the score");
			name = console.nextLine();
			score = console.nextLine();
			studentMap.put(name, score);
		}
		System.out.println(studentMap.keySet());
*/
// 2) Write a program which takes input as first name and last name of 10 students.
/*		Map<String, String> nameMap = new HashMap<String, String>();
		Scanner console = new Scanner(System.in);
		String firstName;
		String lastName;
		for (int i=1; i<=10; i++) {
			System.out.println(i+"- First name and Last name?");
			firstName = console.nextLine();
			lastName = console.nextLine();
			nameMap.put(firstName, lastName);
		}
		for (String first : nameMap.keySet()) {
			String name = nameMap.get(first);
			System.out.println(first + " " + name);
			}
*/
// 3) Write a program which takes input as 5 numbers and their occurrence. (34,5).
/*		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		Scanner console = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter 5 numbers:");
		for (int i=0; i<=4; i++) {
			num = console.nextInt();
			if (numbersMap.containsKey(num)) { 
				int count = numbersMap.get(num);
				numbersMap.put(num, count+1);
				} else { 
				numbersMap.put(num, 1);
				}
		}
		
		for (Integer n : numbersMap.keySet()) {
			Integer occurance = numbersMap.get(n);
			System.out.println(n + "," + occurance);
			}
*/
//4) Write a program which takes input as 15 numbers and find which
// number appears the most.		
		
/*		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		Scanner console = new Scanner(System.in);
		int num = 0;
		int max = 0;
		int maxNumber = 0;
		System.out.println("Enter 15 numbers:");
		for (int i=0; i<15; i++) {
			num = console.nextInt();
			if (numbersMap.containsKey(num)) { 
				int count = numbersMap.get(num);
				numbersMap.put(num, count+1);
				} else { 
				numbersMap.put(num, 1);
				}
		}
		
		for (Integer n : numbersMap.keySet()) {
			int occurance = numbersMap.get(n);
			if (occurance > max) {
				max = occurance;
				maxNumber = n;
			}
		}
			System.out.println("Number:"+ maxNumber);
			System.out.println("Max. count:"+max);
*/
// 5) Write a program which takes input as 15 numbers and find which 
// number appears the least.	
		
/*		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		Scanner console = new Scanner(System.in);
		int num = 0;
		int min = 9999;
		int minNumber = 0;
		System.out.println("Enter 15 numbers:");
		for (int i=0; i<15; i++) {
			num = console.nextInt();
			if (numbersMap.containsKey(num)) { 
				int count = numbersMap.get(num);
				numbersMap.put(num, count+1);
				} else { 
				numbersMap.put(num, 1);
				}
		}
		
		for (Integer n : numbersMap.keySet()) {
			int occurance = numbersMap.get(n);
			if (occurance < min) {
				min = occurance;
				minNumber = n;
			}
		}
			System.out.println("Number:"+ minNumber);
			System.out.println("Min. count:"+min);
*/
// 6) Write a program which takes input as 15 numbers and find which
// number appears even number of times.		
		
/*		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		Scanner console = new Scanner(System.in);
		int num = 0;
		int even = 0;
		int eNumber = 0;
		System.out.println("Enter 15 numbers:");
		for (int i=0; i<15; i++) {
			num = console.nextInt();
			if (numbersMap.containsKey(num)) { 
				int count = numbersMap.get(num);
				numbersMap.put(num, count+1);
				} else { 
				numbersMap.put(num, 1);
				}
		}
		
		for (Integer n : numbersMap.keySet()) {
			int occurance = numbersMap.get(n);
			if (occurance %2 == 0 ) {
				even = occurance;
				eNumber = n;
				System.out.println("Number:"+ eNumber+" - "+even+"times");
			}
			}
*/		
//	7) Write a program which takes input as 15 numbers and find which
// number appears odd number of times.		
/*		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		Scanner console = new Scanner(System.in);
		int num = 0;
		int odd = 0;
		int oNumber = 0;
		System.out.println("Enter 15 numbers:");
		for (int i=0; i<15; i++) {
			num = console.nextInt();
			if (numbersMap.containsKey(num)) { 
				int count = numbersMap.get(num);
				numbersMap.put(num, count+1);
				} else { 
				numbersMap.put(num, 1);
				}
		}
		
		for (Integer n : numbersMap.keySet()) {
			int occurance = numbersMap.get(n);
			if (occurance %2 != 0 ) {
				odd = occurance;
				oNumber = n;
				System.out.println("Number:"+ oNumber+" - "+odd+"times");
			}
			}
*/
//8) Write a program which takes input as 15 numbers and find which
// number appears only 3 times.
/*		Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
		Scanner console = new Scanner(System.in);
		int num = 0;
		int tNumber = 0;
		System.out.println("Enter 15 numbers:");
		for (int i=0; i<15; i++) {
			num = console.nextInt();
			if (numbersMap.containsKey(num)) { 
				int count = numbersMap.get(num);
				numbersMap.put(num, count+1);
				} else { 
				numbersMap.put(num, 1);
				}
		}
		
		for (Integer n : numbersMap.keySet()) {
			int occurance = numbersMap.get(n);
			if (occurance == 3 ) {
				tNumber = n;
				System.out.println("Number:"+ tNumber+" - "+" 3 times");
			}
			}
*/
//9) Write a program which takes input as aaaaabbbbccccccc and out put as a5b4c6.
/*		Map<Character, Integer> numbersMap = new HashMap<Character, Integer>();
		Scanner console = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter the string");
		String str = console.nextLine();
		for (int i=0; i<str.length();i++) {
			
			if (numbersMap.containsKey(str.charAt(i))) { 
				int count = numbersMap.get(str.charAt(i));
				numbersMap.put(str.charAt(i), count+1);
				} else { 
				numbersMap.put(str.charAt(i), 1);
				}
		}
		
		for (Character n : numbersMap.keySet()) {
			int occurance = numbersMap.get(n);
			System.out.println("Letter:"+ n+" - "+occurance+"times");
			
			}
*/
// 10)Write a java program which takes two input as s1 = “Satin”, s2= “Stain”
// Find strings are anagram.	
		Map<Character, Integer> s1Map = new HashMap<Character, Integer>();
		Map<Character, Integer> s2Map = new HashMap<Character, Integer>();
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter 1st string");
		String str1 = console.nextLine().toLowerCase();
		System.out.println("Enter 2nd string");
		String str2 = console.nextLine().toLowerCase();
		for (int i=0; i<str1.length();i++) {
			
			if (s1Map.containsKey(str1.charAt(i))) { 
				int count1 = s1Map.get(str1.charAt(i));
				s1Map.put(str1.charAt(i), count1+1);
				} else { 
				s1Map.put(str1.charAt(i), 1);
				}
		}
		for (int j=0; j<str2.length();j++) {
			
			if (s2Map.containsKey(str2.charAt(j))) { 
				int count2 = s2Map.get(str2.charAt(j));
				s2Map.put(str2.charAt(j), count2+1);
				} else { 
				s2Map.put(str2.charAt(j), 1);
				}
		}
		//System.out.println(s1Map.keySet());
		//System.out.println(s2Map.keySet());
		System.out.println(s1Map);
		if (s1Map.keySet().equals(s2Map.keySet())) {
			System.out.println("These strings are anagram");
			
			} else {
			System.out.println("These strings are not anagram");
			}
		
		
	}

}

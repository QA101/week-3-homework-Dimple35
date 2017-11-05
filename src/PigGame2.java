import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class PigGame2 {

	
	public static void main(String[] args) 
	{
		// 
		boolean playing = true;
		int player = 1;
		int total = 0;
		Character command= ' ';
		
		//---------------------------------------
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many players?(2-4)");
		int numberPlayer = keyboard.nextInt();
		int [] list = new int [numberPlayer];
		//
		for (int i=0; i< numberPlayer; i++) 
			list[i] = 0;
		//
		if (numberPlayer > 4 || numberPlayer < 2) 
		{
			System.out.println("You should enter between 2 and 4");
			playing = false;
		}
		while (playing == true)
		{
			System.out.println("Player-"+player+"'s Turn");
			System.out.println("Enter <Q> for QUIT, <R> for ROLL, <H> for HOLD, <P> for PRINT the score");
			command= keyboard.next().charAt(0); 
			//----------------------------
			if (command.equals('Q'))
			{
				playing = false;

			}
			//----------------------------
			if (command.equals('H'))
			{
				if (player < numberPlayer) {
					player++;
					
				}
				else
				{
					player = 1;
					
					
				}
				total = list[player-1];
			}
			//----------------------------
			if (command.equals('P'))
			{
				System.out.println("Your total score is "+total);;
				

			}
			//----------------------------
			if (command.equals('R'))
			{
				
				int dieNum=rollD(player);
				
				total= total +dieNum;
					
				if (total > 100){

					playing = false;
					System.out.println("Your score:"+total);
					System.out.println("You are the WINNER!");
					System.out.println("GAME OVER");
					command=' ';

				}
				else
				{
					list[player-1] = total;
					System.out.println("Your score:"+total);
					
				}

			}
			
			//
			
		}
		keyboard.close();
	}
		public static int rollD(int p) {
			Random rand = new Random();
			int die	=rand.nextInt(6)+1;
			System.out.println("Your number is "+die);
		return die;
		}
		
		

		
	

}

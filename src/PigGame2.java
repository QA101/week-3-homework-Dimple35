import java.util.Random;
import java.util.Scanner;
public class PigGame2
{
	// This game is played by 2 to 4 players. Each player rolls the die and the player who gets  
	// the highest score wins. If a player rolls a 1, this is not added to the total score 
	// and the play passes to the next player. 
	public static void main(String[] args) 
	{
		boolean playing = true;
		int player = 1;
		int total = 0;
		String command= " ";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many players?(2-4)");
		int numberPlayer = keyboard.nextInt();
		int [] list = new int [numberPlayer];
		if (numberPlayer > 4 || numberPlayer < 2) 
		{
			System.out.println("You should enter between 2 and 4");
			playing = false;
		}
		while (playing == true)
		{
			System.out.println("Player-"+player+"'s Turn");
			System.out.println();
			System.out.println("Enter <QUIT>, <ROLL>, <HOLD> or <PRINT>");
			command= keyboard.next().toUpperCase(); 
// Q ends the game 
			if (command.equals("QUIT"))
			{
				playing = false;

			}
// Next player's turn
			if (command.equals("HOLD"))
			{
				if (player < numberPlayer)
				{
					player++;
				}
				else
				{
					player = 1;
				}
				total = list[player-1]; 
			}
// Print the current player's score
			if (command.equals("PRINT"))
			{
				System.out.println("*---------------------*");
				System.out.println("Your total score is "+total);
				System.out.println("*---------------------*");
			}
// Roll the die 
			if (command.equals("ROLL"))
			{
				int dieNum=rollD(player);
				System.out.println("Your number is "+dieNum);
				if (dieNum!=1) 
				{
					total= total +dieNum;
					if (total > 100)
					{
						playing = false;
						System.out.println("Your score:"+total);
						System.out.println("You are the WINNER!");
						System.out.println("GAME OVER");
						command=" ";
					}
					else
					{
						list[player-1] = total;
						System.out.println("Your score:"+total);
					}
				}
				else
				{
					if (player < numberPlayer)
					{
						player++;
					}
					else
					{
						player = 1;
					}
					total = list[player-1];
				}
			}
		}
		keyboard.close();
	}
// rollD method is used to roll a die, it generates a number between 1 and 6	
	public static int rollD(int p) 
	{
		Random rand = new Random();
		int die	=rand.nextInt(6)+1;
	return die;
	}
}


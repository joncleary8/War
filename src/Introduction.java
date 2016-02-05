import java.util.Scanner;

public class Introduction
	{
		private static int again;
		public static void main(String[] args)
			{
				intro();
				playAgain();
			}
		public static void playAgain()
			{
				Scanner choice = new Scanner(System.in);
				System.out.println("Would you like to play again, Input 1 if you would. If not, input 2.");
				again = choice.nextInt();
			}
		public static void intro()
			{
				int choice;
				Scanner decision = new Scanner(System.in);
				System.out.println("Would you like to play war? Input 1 if you would. If not, input 2.");
				choice = decision.nextInt();
				if (choice==1)
					{
						System.out.println("Welcome to the war zone. You will be battling the computer. Let's begin");	
					}
				if (choice==2)
					{
						System.out.println("I will consider this your surrender. Goodbye!");
						System.exit(0);
					}		
			}
		public static int getAgain()
			{
				return again;
			}
		public static void setAgain(int again)
			{
				Introduction.again = again;
			}
	}

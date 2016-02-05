import java.util.Scanner;

public class Player
	{
		private static Scanner userInput = new Scanner (System.in);
		private static String enter;
		private static int playerTotal;
		private static int computerTotal;
		private static int counter;
		public static void main(String[] args) throws InterruptedException
			{	
				flipCard();
				showScore();	
			}
		public static void flipCard() throws InterruptedException
			{
				int extras = 0;
				for (int i=0; i<26; i++)
					{
						
						System.out.println("Press enter to flip a card");
						enter = userInput.nextLine();
						System.out.println("The computer flipped the " + Deck.getComputerDeck().get(i).getRank() + " of " + Deck.getComputerDeck().get(i).getSuit() );
						System.out.println("You flipped the " + Deck.getPlayerDeck().get(i).getRank() + " of " + Deck.getPlayerDeck().get(i).getSuit() );
						System.out.println(" ");
						
						if (Deck.getComputerDeck().get(i).getValue()== Deck.getPlayerDeck().get(i).getValue())
							{
								extras+=2;
								System.out.println("You tied with the computer. Flip again to see who will win these cards!");
							}
						if (Deck.getComputerDeck().get(i).getValue()> Deck.getPlayerDeck().get(i).getValue())
							{
								computerTotal+=(2+extras);
								System.out.println("The computer had a higher card than you.");
								extras=0;
							}
						if (Deck.getPlayerDeck().get(i).getValue() > Deck.getComputerDeck().get(i).getValue())
							{
								playerTotal+=(2+extras);
								System.out.println("You had a higher card than the computer!");
								extras=0;
							}
						System.out.println("Computer Score: " + computerTotal);
						System.out.println("Your Score: " + playerTotal);
						System.out.println(" ");
						Thread.sleep(800);
					}
				
			}
		public static void showScore()
			{
				System.out.println("The computer score is " + computerTotal + " cards. Your total score is " + playerTotal + " cards.");
				if (computerTotal>playerTotal)
					{
						System.out.println("The computer defeated you. You are now a prisoner of war in Computoria");
					}
				else if (playerTotal>computerTotal)
					{
						System.out.println("You have emerged triumphant. Your forces are victorious over the evil computer");
					}
				else 
					{
						System.out.println("There is no clear winner. Your forces are at a standstill in your engagement with the computer.");
					}
			}
		public static int getPlayerTotal()
			{
				return playerTotal;
			}
		public static void setPlayerTotal(int playerTotal)
			{
				Player.playerTotal = playerTotal;
			}
		public static int getComputerTotal()
			{
				return computerTotal;
			}
		public static void setComputerTotal(int computerTotal)
			{
				Player.computerTotal = computerTotal;
			}
	}

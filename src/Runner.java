
public class Runner
	{
		public static void main(String[] args) throws InterruptedException
			{
				Introduction.intro();
				Deck.getShuffledDeck();
				Deck.makeComputerDeck();
				Deck.makePlayerDeck();
				Dealer.dealDeck();
				Player.flipCard();
				Player.showScore();
				for (int i=0; i<10; i++)
					{
						Introduction.playAgain();
						if (Introduction.getAgain()==1)
							{
								System.out.println("Okay! Let's begin. ");
								System.out.println(" ");
								Player.setComputerTotal(0);
								Player.setPlayerTotal(0);
								Deck.getShuffledDeck();
								Deck.makeComputerDeck();
								Deck.makePlayerDeck();
								Dealer.dealDeck();
								Player.flipCard();
								Player.showScore();	
							}
						else
							{
								System.out.println("Okay. Goodbye."); 
								System.exit(0);
							}
					}
			}
	}

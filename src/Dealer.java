
public class Dealer
	{

		public static void main(String[] args)
			{
				dealDeck();
			}
		public static void dealDeck()
			{
				for (int i = 0; i<52; i++)
					{
						if (i%2==0)
							{
								Deck.getPlayerDeck().get(i/2).setSuit((Deck.getDeck()).get(i).getSuit());
								Deck.getPlayerDeck().get(i/2).setRank((Deck.getDeck()).get(i).getRank());
								Deck.getPlayerDeck().get(i/2).setValue((Deck.getDeck()).get(i).getValue());
							}
						else
							{
								Deck.getComputerDeck().get((i-1)/2).setSuit((Deck.getDeck()).get(i).getSuit());
								Deck.getComputerDeck().get((i-1)/2).setRank((Deck.getDeck()).get(i).getRank());
								Deck.getComputerDeck().get((i-1)/2).setValue((Deck.getDeck()).get(i).getValue());
							}
					}
			}
	}

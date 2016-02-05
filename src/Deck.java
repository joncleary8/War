import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
		private static ArrayList <Card> deck = new ArrayList<Card>();
		private static ArrayList <Card> playerDeck = new ArrayList<Card>();
		private static ArrayList <Card> computerDeck = new ArrayList<Card>();
		
		public static void main(String[] args)
			{
				getShuffledDeck();
				makePlayerDeck();
				makeComputerDeck();
			}
		public static void getShuffledDeck()
		{
			for (int i=2; i<15; i++)
				{
					deck.add(new Card("Clubs", "" , i));
				}
			for (int i=2; i<15; i++)
				{
					deck.add(new Card("Hearts", "" , i));
				}
			for (int i=2; i<15; i++)
				{
					deck.add(new Card("Spades", "" , i));
				}
			for (int i=2; i<15; i++)
				{
					deck.add(new Card("Diamonds", "" , i));
				}
			for (int i=0; i<52; i++)
				{
					if (deck.get(i).getValue()==2)
						{
							deck.get(i).setRank("Two");
						}
					else if (deck.get(i).getValue()==3)
						{
							deck.get(i).setRank("Three");
						}
					else if (deck.get(i).getValue()==4)
						{
							deck.get(i).setRank("Four");
						}
					else if (deck.get(i).getValue()==5)
						{
							deck.get(i).setRank("Five");
						}
					else if (deck.get(i).getValue()==6)
						{
							deck.get(i).setRank("Six");
						}
					else if (deck.get(i).getValue()==7)
						{
							deck.get(i).setRank("Seven");
						}
					else if (deck.get(i).getValue()==8)
						{
							deck.get(i).setRank("Eight");
						}
					else if (deck.get(i).getValue()==9)
						{
							deck.get(i).setRank("Nine");
						}
					else if (deck.get(i).getValue()==10)
						{
							deck.get(i).setRank("Ten");
						}
					else if (deck.get(i).getValue()==11)
						{
							deck.get(i).setRank("Jack");
						}
					else if (deck.get(i).getValue()==12)
						{
							deck.get(i).setRank("Queen");
						}
					else if (deck.get(i).getValue()==13)
						{
							deck.get(i).setRank("King");
						}
					else
						{
							deck.get(i).setRank("Ace");
						}
				}
			Collections.shuffle(deck);
		}
		public static void makeComputerDeck()
			{
				for (int i = 0; i<26; i++)
					{
						computerDeck.add(new Card (" ", " ", 0));
					}
			}
		public static void makePlayerDeck()
			{
				for (int i = 0; i<26; i++)
					{
						playerDeck.add(new Card (" ", " ", 0));
					}
			}
		public static ArrayList<Card> getDeck()
			{
				return deck;
			}
		public static void setDeck(ArrayList<Card> deck)
			{
				Deck.deck = deck;
			}
		public static ArrayList<Card> getPlayerDeck()
			{
				return playerDeck;
			}
		public static void setPlayerOneDeck(ArrayList<Card> playerDeck)
			{
				Deck.playerDeck = playerDeck;
			}
		public static ArrayList<Card> getComputerDeck()
			{
				return computerDeck;
			}
		public static void setComputerDeck(ArrayList<Card> computerDeck)
			{
				Deck.computerDeck = computerDeck;
			}
	}


public class BlackJack

{ 

        public static void main(String args[])

        {

                char play_again;

                do{

                        Deck card_deck = new Deck();

                        Card holder;

                        Hand player = new Hand();

                        Hand dealer = new Hand();

                        card_deck.shuffle(52);

                        for( int i = 0; i < 2; i++ )

                        {

                                holder = card_deck.PickCard();

                                player.AddCard( holder );

                        }

                        System.out.print("Your cards are ");

                        player.DisplayHand();

                        int hand_value = player.HandValue();

                        if( hand_value == 21 )

                                System.out.println("You win! Your cards have a value of " + hand_value);

                        else if(hand_value > 21)

                                System.out.println("You lose! Your cards have a value of " + hand_value);

                        else

                        {

                                System.out.println("Your card value is " + hand_value);

                                holder = card_deck.PickCard();

                                dealer.AddCard(holder);

                                System.out.print("The dealer's card is ");

                                dealer.DisplayHand();

                                holder = card_deck.PickCard();

                                dealer.AddCard(holder);

                                String to_play = Input.getString("Please enter whether you want to hit or stay");

                                while(to_play.equals("hit"))

                                {

                                        holder = card_deck.PickCard();

                                        player.AddCard(holder);

                                        System.out.print("Your cards are ");

                                        player.DisplayHand();

                                        hand_value = player.HandValue();

					if( hand_value == 21 )

                                                break;

                                        else if(hand_value > 21)

                                                break;

                                        else

                                                System.out.println("Your card value is " + hand_value);

                                        to_play = Input.getString("Please enter whether you want to hit or stay");

                                }

                                if( hand_value == 21 )

                                        System.out.println("You win! Your cards have a value of " + hand_value);

                                else if(hand_value > 21)

                                        System.out.println("You lose! Your cards have a value of " + hand_value);

                                else

                                {

                                        int hand_value2 = dealer.HandValue();

                                        do{

                                                if(hand_value2 < 17)

                                                {

                                                        holder = card_deck.PickCard();

                                                        dealer.AddCard(holder);

                                                        System.out.print("The dealer's cars are ");

                                                        dealer.DisplayHand();

                                                        hand_value2 = dealer.HandValue();

                                                        if( hand_value2 == 21 )

                                                        {

                                                                System.out.println("You lose! The dealer's cards have a value of " + hand_value2);

                                                                break;

                                                        }

                                                        else if(hand_value2 > 21)

                                                        {

                                                                System.out.println("You win! The dealer's cards have a value of " + hand_value2);

                                                                break;

                                                        }

                                                        else if(hand_value2 > 17)

                                                        {

                                                                System.out.println("The dealer's card value is " + hand_value2);

                                                                if(hand_value2 > hand_value)

                                                                        System.out.println("The dealer wins!");

                                                                else if (hand_value2 < hand_value)


                                                                        System.out.println("The player wins!");

                                                                else if (hand_value2 == hand_value)

                                                                        System.out.println("It is a tie");

                                                        }

                                                }

                                                else

                                                {

                                                        if( hand_value2 == 21 )

                                                        {

                                                                System.out.println("You lose! The dealer's cards have a value of " + hand_value2);

                                                                break;

                                                        }

                                                        else if(hand_value2 > 21)

                                                        {

                                                                System.out.println("You win! The dealer's cards have a value of " + hand_value2);

                                                                break;

                                                        }



                                                        System.out.println("The dealer's card value is " + hand_value2);

                                                        if(hand_value2 > hand_value)

                                                                        System.out.println("The dealer wins!");

                                                        else if (hand_value2 < hand_value)

                                                                        System.out.println("The player wins!");

                                                        else if (hand_value2 == hand_value)

                                                                        System.out.println("It is a tie");

                                                }

                                        } while( hand_value2 < 17 );

                                }
			}
			play_again = Input.getChar("Please enter y or n to tell us if you would like to play again");
			System.out.println();
		}while(play_again == 'y');
	}
}

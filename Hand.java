public class Hand

{ 

        Card hand[] = new Card[52];

        private int cards_in_hand;

        int hand_value = 0;

        public void AddCard( Card new_card )

        {

                hand[cards_in_hand] = new_card;

                cards_in_hand++;



        }

        public void DisplayHand()

        {

                for( int i = 0; i < cards_in_hand; i++ )

                {

                        System.out.print(hand[i].name + " ");

                }

                System.out.println();

        }

        public int HandValue()

        {

                int hand_value = 0;

                int ace_counter = 0;

                for(int i = 0; i < cards_in_hand; i++)

                {

                        if( hand[i].face_value.equals("A"))

                                ace_counter++;

                        else

                                hand_value += hand[i].bj_value;

                }

                for(int j = 0; j < ace_counter; j++)

                {

                        if(hand_value + 11 <= 21)

                                hand_value += 11;

                        else

                                hand_value += 1;

                }

                return hand_value;

        }

}



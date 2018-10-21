import java.util.Random;



public class Deck

{



        private Card cardArray[] = new Card[ 52 ];

        String faceArray[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

        char suiteArray[] = { 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'D', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'H', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'C', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S', 'S' };

        int valueArray[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1 };



        public Deck()

        {

                for( int i = 0; i < cardArray.length; i++ )

                {

                        String face = faceArray[i];

                        char suite = suiteArray[i];

                        int value = valueArray[i];

                        cardArray[i] = new Card( value, face, suite );

                }

        }

        public void shuffle( int num_of_shuffle )

        {

                Card temp_card;

                for( int i = 0; i < num_of_shuffle; i++ )

                {

                        int a = (int)(Math.random() * (52));

                        int b = (int)(Math.random() * (52));

                        // swap the two cards using a temporary variable

                        temp_card = cardArray[a];

                        cardArray[a] = cardArray[b];

                        cardArray[b] = temp_card;

                }

        }

        public Card PickCard ()

        {

                int array_num = 0;

                Card card_picked;

                do {

                        card_picked = cardArray[array_num];

                        array_num++;

                } while ( cardArray[array_num].dealt == true );

                cardArray[array_num].SetDealt(true);

                return card_picked;



        }

}



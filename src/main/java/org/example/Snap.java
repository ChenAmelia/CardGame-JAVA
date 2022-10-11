package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> playerCards = new ArrayList<>();
    ArrayList<String> cardsValue = new ArrayList<>();

    public Snap(String name) {

        super(name);
    }

    @Override
    public void dealCard() {
        super.dealCard();

        String userInput = scanner.nextLine();


        while(userInput.equals("")) {

            String getTopCard = String.valueOf(deckOfCards.get(0));
            String cardValue = String.valueOf(deckOfCards.get(0).getValue());

            deckOfCards.remove(0);

            playerCards.add(getTopCard);
            cardsValue.add(cardValue);

            System.out.println("The new card you get is \n" + getTopCard);
            userInput = scanner.nextLine();

            System.out.println("The card collection is \n"+playerCards);
//            System.out.println("The value of card you get is \n"+cardsValue);


            for(int i = 0; i < cardsValue.size(); i++) {
//                System.out.println("The cards value are "+ cardsValue.get(i));
                for (int j = i+1; j < cardsValue.size(); j ++) {
                    if(cardsValue.get(i).equals(cardsValue.get(j))) {
                        System.out.println("You win!");
                        break;
                    }
                }
            }
        }

    }
}

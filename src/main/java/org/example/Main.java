package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CardGame card = new CardGame("me");
        card.getDeck();
        card.shuffledDeck();
        System.out.println(card.deckOfCards);




        //=====================Scanner=====================================================

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first player's name");
        String name1 = scanner.nextLine();
        System.out.println("Please input the second player's name");
        String name2 = scanner.nextLine();
        System.out.println("Hello " + name1 + " and " + name2 + "! Welcome to Snap!");
        System.out.println("Please press enter to get your card.");

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        System.out.println(player1);
        System.out.println(player2);





        //=================================================================================


        String userInput = scanner.nextLine();
        ArrayList<String> playerCards = new ArrayList<>();
        ArrayList<String> cardsValue = new ArrayList<>();


        while(userInput.equals("")) {

            String getTopCard = String.valueOf(card.deckOfCards.get(0));

            String cardValue = String.valueOf(card.deckOfCards.get(0).getValue());

            card.deckOfCards.remove(0);

            playerCards.add(getTopCard);
            cardsValue.add(cardValue);

            System.out.println("The new card you get is \n" + getTopCard);
            userInput = scanner.nextLine();


//            System.out.println("The value of card you get is \n"+cardsValue);


            for(int i = 0; i < cardsValue.size(); i++) {
//                System.out.println("The cards value are "+ cardsValue.get(i));
                for (int j = i+1; j < cardsValue.size(); j ++) {
                    if(cardsValue.get(i).equals(cardsValue.get(j))) {
                        System.out.println("You win!");
                        System.out.println("The card collection is \n"+playerCards +"\n");
                        return;
                    }
                }

            }
        }







        //建立player clas，给每个玩家建立自己的dec，把玩家抽的牌放进他们自己的dec， 然后进行比较
        //因为现在相当于建立了一个新的array，与以前的是没有关系的，而getSymbol的命令存在于以前的class，这个新的是没法调用的。




















    }

}

//    String userInput = scanner.nextLine();
//    ArrayList<String> playerCards = new ArrayList<>();
//    ArrayList<String> cardsValue = new ArrayList<>();
//
//
//        while(userInput.equals("")) {
//
//                String getTopCard = String.valueOf(card.deckOfCards.get(0));
//
//                String cardValue = String.valueOf(card.deckOfCards.get(0).getValue());
//
//                card.deckOfCards.remove(0);
//
//                playerCards.add(getTopCard);
//                cardsValue.add(cardValue);
//
//                System.out.println("The new card you get is \n" + getTopCard);
//                userInput = scanner.nextLine();
//
//                System.out.println("The card collection is \n"+playerCards);
////            System.out.println("The value of card you get is \n"+cardsValue);
//
//
//                for(int i = 0; i < cardsValue.size(); i++) {
////                System.out.println("The cards value are "+ cardsValue.get(i));
//        for (int j = i+1; j < cardsValue.size(); j ++) {
//        if(cardsValue.get(i).equals(cardsValue.get(j))) {
//        System.out.println("You win!");
//        break;
//        }
//        }
//
//        }
//
//
//        }
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CardGame {

    private String name;

    private final String[] symbols = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final String[] suits = new String[] {"♥", "♦", "♣", "♠"};
    private final int[] value = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public ArrayList<Card> deckOfCards = new ArrayList<>();




    public CardGame(String name) {
        this.name = name;
    }

    public void getDeck() {
        for(int i = 0; i < symbols.length; i++) {
            for(int j = 0; j < suits.length; j++) {
                Card card = new Card(symbols[i], suits[j]);
                card.setValue(value[i]);
                deckOfCards.add(card);
                //System.out.println(card);  //printout the card, sorted by numbers and suits
            }
        }
        //shuffle all cards in the getDeck function, but a separate method required
        //System.out.println(deckOfCards);
        //Collections.shuffle(this.deckOfCards);
        //System.out.println(deckOfCards);
    }

    public void shuffledDeck() {
        Collections.shuffle(this.deckOfCards);
        //System.out.println(deckOfCards);
    }

    public void dealCard() {


    }




    }








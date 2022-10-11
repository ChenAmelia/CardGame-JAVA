package org.example;

import java.util.Arrays;


public class Card {


    private String symbol;
    //{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String suits;
    //{"♥", "♦", "♣", "♠"};
    private int value;
    //{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


    public Card(String symbol, String suits, int value) {
        this.symbol = symbol;
        this.suits = suits;
        this.value = value;
    }

    public Card(String symbol, String suits) {
        this.symbol = symbol;
        this.suits = suits;
    }

    public Card(String symbol) {
        this.symbol = symbol;
    }




    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "————————————\n"+
                "|"+ symbol+suits+   "        |\n"+
                "|"+"          |\n"+
                "|"+"          |\n"+
                "|"+"          |\n"+
                "|        "+suits+symbol+"|\n"+
                "————————————\n";
//        suits+symbol;



    }
}

package jp.ac.uryukyu.ie.e175765;

import javax.swing.*;

public class Card {
    private int number;
    private int ran;
    private String suit;
    private String ill;

    //コンストラクタ
    public Card() {
        play();
        mark();
    }

    public int getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }

    public String getIll() {
        return ill;
    }

    //ランダムに０〜１３の中から一つ選ぶ。
    public void play() {
        this.number = (int) (Math.random() * 13);
        switch (number) {
            case 11:
                ill = "J";
                break;
            case 12:
                ill = "Q";
                break;
            case 13:
                ill = "K";
                break;
            case 0:
                ill = "joker";
                break;
        }
    }

    public void mark(){
         ran = (int)(Math.random()*4);
        switch (ran) {
            case 0:
                suit = "joker";
            case 1:
                suit = "spade";
                break;
            case 2:
                suit = "heart";
                break;
            case 3:
                suit = "dia";
                break;
            case 4:
                suit = "clover";
                break;
        }
    }

}

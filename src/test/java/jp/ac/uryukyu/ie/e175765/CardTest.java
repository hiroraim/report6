package jp.ac.uryukyu.ie.e175765;

import org.junit.jupiter.api.Test;

import java.util.jar.JarEntry;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    /*
    カードの番号が0,11,12,13の時にnullじゃないことを確認したい。
     */
    public void play() {
        for (int i= 0; i<20 ;i++) {
            Card card = new Card();
            assertNotNull(card);
            if (card.getNumber() > 0 && card.getNumber() <= 10) {
                System.out.println(card.getSuit() + ":" + card.getNumber());
            } else {
                if (card.getNumber() == 0) {
                    System.out.println(card.getIll() + "です。");
                } else {
                    System.out.println(card.getSuit() + ":" + card.getIll());
                }
            }
        }
    }

}

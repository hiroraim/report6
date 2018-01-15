package jp.ac.uryukyu.ie.e175765;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            Card card = new Card();
            if (card.getNumber() == card.getNumber() && card.getSuit() == card.getSuit()) {
                //カードのナンバーとマークが一緒の時の処理
                while(card.getNumber() == card.getNumber()) {
                    new Card();
                    break;
                }

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
//同じマーク・ナンバーのカードが出ないようにしたい。
    }

}

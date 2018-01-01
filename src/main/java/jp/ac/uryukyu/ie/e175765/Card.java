package jp.ac.uryukyu.ie.e175765;

public class Card {
    int number;
    String suit;
    //コンストラクタ
    public Card(){
        play();

    }
    public void play(){
        number = (int)(Math.random()*13);
        int ran = (int)(Math.random()*4);
        switch (ran) {
            case 1:
                suit = "spade";
                //System.out.println("スペード");
                break;
            case 2:
                suit = "heart";
                //System.out.println("ハート");
                break;
            case 3:
                suit = "dia";
                //System.out.println("ダイヤ");
                break;
            case 4:
                suit = "clover";
                //System.out.println("クローバー");
                break;
        }
            //System.out.println(number);

            System.out.println("マークは" + suit + "の"+number+"です。");
    }
}

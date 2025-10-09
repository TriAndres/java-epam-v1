package ru.epam.learn.main;

import ru.epam.learn.action.CompareCoin;
import ru.epam.learn.bean.Coin;

public class CoinMain {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        coin1.setDiameter(-0.11);
        coin1.setDiameter(-0.12);
        coin1.setWeight(150);
        Coin coin2 = new Coin();
        coin2.setDiameter(0.21);
        coin1.setWeight(170);
        CompareCoin compare = new CompareCoin();
        compare.compareDiameter(coin1, coin2);

    }
}

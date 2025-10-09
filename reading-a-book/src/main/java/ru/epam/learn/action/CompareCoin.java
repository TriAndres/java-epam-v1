package ru.epam.learn.action;

import ru.epam.learn.bean.Coin;

public class CompareCoin {
    public void compareDiameter(Coin first, Coin second) {
        double delte = first.getDiameter() - second.getDiameter();
        if (delte > 0) {
            System.out.println("delte > 0");
        } else if (delte == 0) {
            System.out.println("delte == 0");
        } else {
            System.out.println("else ...");
        }
    }
}

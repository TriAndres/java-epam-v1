package ru.epam.learn.main;


import ru.epam.learn.action.TutorialAction;

public class FirstProgram {
    public static void main(String[] args) {
        TutorialAction action = new TutorialAction();
        action.printMessage("tutorial-> https://docs.oracle.com/javase/tutorial/");
    }
}
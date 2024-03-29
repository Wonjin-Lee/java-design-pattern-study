package com.wonjin.designpattern.bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Bose."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Kamill."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Aesop."));
        RandomCountDisplay d4 = new RandomCountDisplay(new StringDisplayImpl("Hello Apple."));
        RandomCountDisplay d5 = new RandomCountDisplay(new FileDisplayImpl("star.txt"));
        IncreaseDisplay d6 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        d4.randomDisplay(5);
        d5.multiDisplay(3);
        d5.randomDisplay(5);
        d6.increaseDisplay(4);
        d7.increaseDisplay(6);
    }
}

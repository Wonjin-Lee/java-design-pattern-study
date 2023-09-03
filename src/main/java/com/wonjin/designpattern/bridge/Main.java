package com.wonjin.designpattern.bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Bose."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, Kamill."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Aesop."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}

package com.wonjin.designpattern.bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        multiDisplay(new Random().nextInt(times));
    }
}

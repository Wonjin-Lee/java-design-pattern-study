package com.wonjin.designpattern.factorymethod;

import com.wonjin.designpattern.factorymethod.framework.Factory;
import com.wonjin.designpattern.factorymethod.framework.Product;
import com.wonjin.designpattern.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("고윤정");
        Product card2 = factory.create("전여빈");
        Product card3 = factory.create("지수");
        card1.use();
        card2.use();
        card3.use();
    }
}

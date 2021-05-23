package com.wonjin.designpattern.prototype;

import com.wonjin.designpattern.prototype.framework.Product;

public class UnderlinePen extends Product {

    private char underlineChar;

    public UnderlinePen(char underlineChar) {
        this.underlineChar = underlineChar;
    }

    @Override
    public void use(String str) {
        int length = str.getBytes().length;
        System.out.println("\"" + str + "\"");
        System.out.print("");
        for (int i = 0; i < length; i++) {
            System.out.print(underlineChar);
        }
        System.out.println();
    }
}

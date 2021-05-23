package com.wonjin.designpattern.prototype;

import com.wonjin.designpattern.prototype.framework.Manager;
import com.wonjin.designpattern.prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();

        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox warningBox = new MessageBox('*');
        MessageBox slashBox = new MessageBox('/');

        manager.register("strong message", underlinePen);
        manager.register("warning box", warningBox);
        manager.register("slash box", slashBox);

        // 생성
        Product product1 = manager.create("strong message");
        product1.use("Hello, world.");

        Product product2 = manager.create("warning box");
        product2.use("Hello, world.");

        Product product3 = manager.create("slash box");
        product3.use("Hello, world.");
    }
}

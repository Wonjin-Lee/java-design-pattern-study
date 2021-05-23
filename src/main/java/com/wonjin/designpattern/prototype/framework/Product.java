package com.wonjin.designpattern.prototype.framework;

public abstract class Product implements Cloneable {
    public abstract void use(String str);
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}

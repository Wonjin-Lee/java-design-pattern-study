package com.wonjin.designpattern.singleton.exercise;

public class Triple {

    private int id;

    private static Triple[] triple = new Triple[] {
        new Triple(0),
        new Triple(1),
        new Triple(2)
    };

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return triple[id];
    }

    public String toString() {
        return "[Triple id=" + id + "]";
    }
}

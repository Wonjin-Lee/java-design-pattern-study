package com.wonjin.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> iterator = directory.iterator();

        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> iterator = directory.iterator();

        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.printList(prefix + "/" + name);
        }
    }
}

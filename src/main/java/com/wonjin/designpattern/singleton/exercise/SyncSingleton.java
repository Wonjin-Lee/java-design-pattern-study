package com.wonjin.designpattern.singleton.exercise;

public class SyncSingleton {
    private static SyncSingleton singleton = null;

    private SyncSingleton() { }

    public static synchronized SyncSingleton getInstance() {
        if (singleton == null) {
            singleton = new SyncSingleton();
        }
        return singleton;
    }
}

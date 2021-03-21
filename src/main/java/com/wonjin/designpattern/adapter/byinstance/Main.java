package com.wonjin.designpattern.adapter.byinstance;

import com.wonjin.designpattern.adapter.byclass.Print;
import com.wonjin.designpattern.adapter.byclass.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}

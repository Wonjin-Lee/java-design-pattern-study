package com.wonjin.designpattern.adapter.byinstance;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String text) {
        this.banner = new Banner(text);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}

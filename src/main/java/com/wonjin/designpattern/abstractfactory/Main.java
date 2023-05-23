package com.wonjin.designpattern.abstractfactory;

import com.wonjin.designpattern.abstractfactory.factory.Factory;
import com.wonjin.designpattern.abstractfactory.factory.Link;
import com.wonjin.designpattern.abstractfactory.factory.Page;
import com.wonjin.designpattern.abstractfactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory(args[0]);

        Link joins = factory.createLink("중앙일보", "http://www.joins.com/");
        Link chosun = factory.createLink("조선일보", "http://www.chosun.com/");

        Link naver = factory.createLink("Naver", "http://www.naver.com/");
        Link daum = factory.createLink("Daum", "http://www.daum.net/");

        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray trayNews = factory.createTray("신문");
        trayNews.add(joins);
        trayNews.add(chosun);

        Tray trayKorSearch = factory.createTray("한국 검색엔진");
        trayKorSearch.add(naver);
        trayKorSearch.add(daum);

        Tray traySearch = factory.createTray("검색엔진");
        traySearch.add(trayKorSearch);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "ADER");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}

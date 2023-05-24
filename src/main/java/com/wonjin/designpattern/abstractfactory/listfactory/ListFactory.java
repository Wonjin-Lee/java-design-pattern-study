package com.wonjin.designpattern.abstractfactory.listfactory;

import com.wonjin.designpattern.abstractfactory.factory.Factory;
import com.wonjin.designpattern.abstractfactory.factory.Link;
import com.wonjin.designpattern.abstractfactory.factory.Page;
import com.wonjin.designpattern.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}

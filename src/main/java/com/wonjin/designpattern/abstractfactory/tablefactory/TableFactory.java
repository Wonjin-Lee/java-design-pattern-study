package com.wonjin.designpattern.abstractfactory.tablefactory;

import com.wonjin.designpattern.abstractfactory.factory.Factory;
import com.wonjin.designpattern.abstractfactory.factory.Link;
import com.wonjin.designpattern.abstractfactory.factory.Page;
import com.wonjin.designpattern.abstractfactory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}

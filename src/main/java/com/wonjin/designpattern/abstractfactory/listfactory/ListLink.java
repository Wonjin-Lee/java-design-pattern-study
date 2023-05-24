package com.wonjin.designpattern.abstractfactory.listfactory;

import com.wonjin.designpattern.abstractfactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + "\">" + caption + "</a></li>\n";
    }
}

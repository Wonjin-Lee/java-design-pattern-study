package com.wonjin.designpattern.abstractfactory.tablefactory;

import com.wonjin.designpattern.abstractfactory.factory.Item;
import com.wonjin.designpattern.abstractfactory.factory.Page;

import java.util.Iterator;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></header>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>");
        }

        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");

        return buffer.toString();
    }
}

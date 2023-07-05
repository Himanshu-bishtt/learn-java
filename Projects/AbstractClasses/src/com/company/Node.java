package com.company;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.nextLink;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.nextLink = item;
        return this.nextLink;
    }

    @Override
    public ListItem previous() {
        return this.previousLink;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.previousLink = item;
        return this.previousLink;
    }

    @Override
    public int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}

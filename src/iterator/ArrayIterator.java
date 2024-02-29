package iterator;

import java.util.ArrayList;
import java.util.List;

public class ArrayIterator implements Iterator {

    private String[] urls;
    private int curIdx;
    private int sz;

    public ArrayIterator(String[] urls, int sz) {
        this.urls = urls;
        this.curIdx = 0;
        this.sz = sz;
    }

    @Override
    public boolean hasNext() {
        return curIdx != sz;
    }

    @Override
    public String current() {
        return urls[curIdx];
    }

    @Override
    public void next() {
        curIdx++;
    }
}

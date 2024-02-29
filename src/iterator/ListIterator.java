package iterator;

import java.util.ArrayList;
import java.util.List;

public class ListIterator implements Iterator {

    private List<String> urls;
    private int curIdx;


    public ListIterator(List<String> urls) {
        this.urls = urls;
        this.curIdx = 0;
    }


    @Override
    public boolean hasNext() {
        return curIdx != urls.size();
    }

    @Override
    public String current() {
        return urls.get(curIdx);
    }

    @Override
    public void next() {
        curIdx++;
    }
}

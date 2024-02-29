package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistoryUsingInnerClass {

    List<String> urls = new ArrayList<>();


    public void push(String s) {
        urls.add(s);
    }

    public String pop() {
        String lastUrl = urls.get(urls.size() - 1);
        urls.remove(lastUrl);
        return lastUrl;
    }


    public Iterator createIterator() {
        return new ListIter(this);
    }


    class ListIter implements Iterator {

        BrowserHistoryUsingInnerClass history;
        int cutIdx;

        public ListIter(BrowserHistoryUsingInnerClass history) {
            this.history = history;
            this.cutIdx = 0;
        }

        @Override
        public boolean hasNext() {
            return cutIdx < history.urls.size();
        }

        @Override
        public String current() {
            return urls.get(cutIdx);
        }

        @Override
        public void next() {
            cutIdx++;
        }
    }


}

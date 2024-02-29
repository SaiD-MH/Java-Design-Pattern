package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {


    String[] urls = new String[10];
    int curId = 0;

    public void push(String s) {
        urls[curId++] = s;
    }

    public String pop() {

        int lstIdx = curId;
        String lastOne = urls[lstIdx];
        curId--;
        return lastOne;
    }


    public Iterator createIterator() {
        return new ArrayIterator(urls, curId );
    }


}

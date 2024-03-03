package StructuralPatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, EBook> eBookMap = new HashMap<>();


    public void add(EBook eBook) {
        eBookMap.put(eBook.getFileName(), eBook);
    }

    public void getEBooks() {
        for (EBook eBook : eBookMap.values())
            eBook.show(eBook.getFileName());

    }

    public void openBook(String fileName) {
        eBookMap.get(fileName).show(fileName);
    }
}

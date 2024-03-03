package BehaviourPatterns.iterator;

public class Main {

    public static void main(String[] args) {


        BrowserHistoryUsingInnerClass history = new BrowserHistoryUsingInnerClass();
        history.push("url1");
        history.push("url2");
        history.push("url3");
        String  st = history.pop();

        Iterator iterator = history.createIterator();
        System.out.println("------------------------------------------");
        while (iterator.hasNext()){

            System.out.println(iterator.current());
            iterator.next();

        }


    }
}

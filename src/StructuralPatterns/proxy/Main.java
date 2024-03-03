package StructuralPatterns.proxy;

public class Main {


    public static void main(String[] args) {

        Library library = new Library();

        library.add(new ProxyEBook("A"));
        library.add(new ProxyEBook("C"));
        library.add(new ProxyEBook("B"));

        library.openBook("A");
    }

}

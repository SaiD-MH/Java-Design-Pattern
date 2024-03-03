package StructuralPatterns.composite;

public class Main {


    public static void main(String[] args) {


        Group group1 = new Group();

        group1.add(new Shape());
        group1.add(new Shape());

        Group group2 = new Group();

        group2.add(new Shape());
        group2.add(new Shape());

        group1.add(group2);
        group1.render();
    }
}


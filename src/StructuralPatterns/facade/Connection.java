package StructuralPatterns.facade;

public class Connection {

    public Connection connect(){
        return new Connection();
    }
}

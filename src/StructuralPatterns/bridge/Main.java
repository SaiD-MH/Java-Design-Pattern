package StructuralPatterns.bridge;

public class Main {

    public static void main(String[] args) {

        RemoteControl control = new RemoteControl(new LgTv());

        control.turnOn();
        control.turnOff();


    }
}

package BehaviourPatterns.mediator.usingObserver;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    List<Observer> observers = new ArrayList<>();

    void add(Observer observer ){
        observers.add(observer);
    }

    void notifyObservers(){
        for(Observer observer : observers)
            observer.update();
    }

}

package memento;

import java.util.ArrayList;
import java.util.List;

public class History {


    private List<State> states = new ArrayList<>();


    public void push(State state) {

        states.add(state);

    }

    public State pop() {
        int sz = states.size() - 1;
        State lastState = states.get(sz);
        states.remove(lastState);
        return lastState;
    }


}

package BehaviourPatterns.memento;

import BehaviourPatterns.memento.Editor;
import BehaviourPatterns.memento.History;

public class Main {
    public static void main(String[] args) {


        Editor editor = new Editor();
        History history = new History();
        editor.setContent("A");
        history.push(editor.createState());

        editor.setContent("B");
        history.push(editor.createState());
        editor.setContent("C");

        System.out.println(editor.getContent());

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

    }
}

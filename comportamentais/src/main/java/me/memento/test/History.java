package me.memento.test;

import java.util.Stack;

public class History {
    private Stack<Memento> history = new Stack<>();;

    public void save(Originator originator) {
        history.push(originator.saveStateToMemento());
    }

    public void revert(Originator originator) {
        originator.getStateFromMemento(history.pop());
    }
}

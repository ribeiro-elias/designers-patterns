package me.memento.test;

public interface Originator {
    String getState();
    Memento saveStateToMemento();
    void getStateFromMemento(Memento memento);
}

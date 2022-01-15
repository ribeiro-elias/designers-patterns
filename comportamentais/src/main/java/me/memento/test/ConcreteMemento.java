package me.memento.test;

public class ConcreteMemento implements Memento{
    private final String state;

    public ConcreteMemento(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return this.state;
    }
}

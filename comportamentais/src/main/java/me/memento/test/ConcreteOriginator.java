package me.memento.test;

import plural.memento.EmployeeMemento;

public class ConcreteOriginator implements Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento(){
        return new ConcreteMemento(this.state);
    }

    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }

    public void revert(Memento memento) {
        this.state = memento.getState();
    }
}

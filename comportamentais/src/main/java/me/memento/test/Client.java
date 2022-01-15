package me.memento.test;

public class Client {
    public static void main(String[] args) {
        History history = new History();
        ConcreteOriginator concreteOriginator = new ConcreteOriginator();

        concreteOriginator.setState("State 1 ");
        concreteOriginator.saveStateToMemento();
        history.save(concreteOriginator);

        System.out.println(concreteOriginator.getState());
        concreteOriginator.setState("State 2");
        history.save(concreteOriginator);
        history.revert(concreteOriginator);

        System.out.println(concreteOriginator.getState());
        history.revert(concreteOriginator);
        System.out.println(concreteOriginator.getState());

    }
}

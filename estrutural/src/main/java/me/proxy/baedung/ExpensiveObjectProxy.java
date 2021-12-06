package me.proxy.baedung;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        System.out.println("Proxy");
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}

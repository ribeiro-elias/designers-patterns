package me.proxy.cache;



import java.util.List;

public class Client {
    public static void main(String[] args) {

        ExpensiveObjectProxy expensiveObjectProxy = new ExpensiveObjectProxy();

        Student aluno2 = new Student("Elias Silva", 2L);
        Student aluno4 = new Student("Elias Silva", 2L);

        List.of(aluno2,aluno4).forEach(expensiveObjectProxy::process);
    }
}

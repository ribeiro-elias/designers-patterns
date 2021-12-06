package me.proxy.cache;

public class ExpensiveObjectImpl implements ValidStudents {

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }



    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration...");
    }


    @Override
    public void process(Student alunos) {
        System.out.println("=========================================================================");
        System.out.println("Nome do aluno é " + alunos.getName() + " com ID " + alunos.getId());
        System.out.println("=========================================================================");
    }
}

package me.proxy.cache;


import java.util.HashMap;
import java.util.Map;

public class ExpensiveObjectProxy implements ValidStudents {
    private static ValidStudents object;
    private static HashMap<Long, Student> alunosCache = new HashMap<>();

    @Override
    public void process(Student student) {
        boolean hasStudentInCache = alunosCache.containsKey(student.getId());
        if(!hasStudentInCache){
            System.out.println("Estou cacheando o aluno " + student.getName());
            student.setName(student.getName() + " cacheado");
            alunosCache.put(student.getId(),student);
        }
        if(object == null){
            object = new ExpensiveObjectImpl();
        }
        Map.Entry<Long, Student> aluno_nao_pode_ser_nulo = alunosCache.entrySet().stream().filter(e -> e.getKey().equals(student.getId())).findFirst().orElseThrow(() -> new IllegalArgumentException("aluno nao pode ser nulo"));
        Student student1 = aluno_nao_pode_ser_nulo.getValue();
        object.process(student1);
    }
}

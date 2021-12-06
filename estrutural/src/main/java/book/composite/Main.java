package book.composite;

public class Main {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        CompositeSalesDepartament compositeSalesDepartament = new CompositeSalesDepartament();
        CompositeDevDepartament compositeDevDepartament = new CompositeDevDepartament();

        Composite composite = new Composite();

        composite.add(compositeDevDepartament);
        composite.add(compositeSalesDepartament);


    }
}

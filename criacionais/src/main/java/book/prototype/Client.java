package book.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Cloneable> shapes = new ArrayList<>();
        List<Cloneable> shapesClone = new ArrayList<>();

        Cicle cicle = new Cicle();
        cicle.setX(10);
        cicle.setY(10);
        cicle.setRadius(20);

        shapes.add(cicle);

        Shape anotherCicle = cicle.clone();
        shapes.add(anotherCicle);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(10);
        shapes.add(rectangle);

        for(Cloneable shape: shapes){
            shapesClone.add(shape);
        }

        for (Cloneable shape: shapesClone){
            System.out.println(shape.toString());
        }
    }
}

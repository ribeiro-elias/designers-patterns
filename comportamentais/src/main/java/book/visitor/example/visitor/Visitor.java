package book.visitor.example.visitor;


import book.visitor.example.shapes.Circle;
import book.visitor.example.shapes.CompoundShape;
import book.visitor.example.shapes.Dot;
import book.visitor.example.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}

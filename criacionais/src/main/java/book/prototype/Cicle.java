package book.prototype;

public class Cicle extends Shape{

    private Integer radius;

    public Cicle() {
    }

    public Cicle(Cicle cicle) {
        super(cicle);
        this.radius = cicle.getRadius();
    }

    @Override
    public Shape clone() {
        return new Cicle(this);
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cicle{" +
                "radius=" + radius +
                '}';
    }
}

package book.prototype;

public abstract class Shape implements Cloneable{
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape shape) {
        this();
        this.x = shape.x;
        this.y = shape.y;
        this.color = shape.color;
    }

    public abstract Shape clone();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

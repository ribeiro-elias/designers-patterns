package book.prototype;

public class Rectangle extends Shape {

    private Integer width;
    private Integer height;

    public Rectangle(Rectangle shape) {
        super(shape);
        this.width = shape.getWidth();
        this.height = shape.getHeight();
    }

    public Rectangle() {

    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

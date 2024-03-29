package projekt;

public class Rectangle {
    private double width = 1.;
    private double height = 1.;


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;

    }

    public double getParimeter() {
        return (2 * (width + height));
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

}

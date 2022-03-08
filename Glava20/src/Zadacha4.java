


interface Interface {
    public void change(int deltaX, int deltaY);
}
abstract class  Shape implements Interface {
    protected int x,y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void change(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y +=deltaY;

    }
    public abstract double calculateSurface();
}
class Rectangle extends Shape {
    protected double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

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

    @Override
    public double calculateSurface() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + this.width +
                ", height=" + this.height +
                ", area=" + this.calculateSurface() +
                '}';
    }
}
class Triangle extends Rectangle {

    public Triangle(double width, double height) {
        super(width, height);
    }
    @Override
    public double calculateSurface() {
        return this.width * this.height / 2;
    }



    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + this.calculateSurface() +
                '}';
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI* this.radius * this.radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", area=" + this.calculateSurface() +
                '}';
    }
}


public class Zadacha4 {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(3,4),
                new Triangle(3,4),
                new Circle(10),};
        for (var shape : shapes) {
            System.out.println(shape + " -> area=" + shape.calculateSurface());
        }

    }
}

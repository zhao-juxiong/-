package test3;

public class Triangle implements Shape{
    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (side + side + side)/2;
    }

    @Override
    public double perimeter() {
        return  (side + side + side);
    }
}

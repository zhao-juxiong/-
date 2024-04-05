package test3;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Square s1 = new Square(2);
        Triangle t1 = new Triangle(3);

        System.out.println("Circle область:"+c1.area());
        System.out.println("Circle периметр:"+c1.perimeter());

        System.out.println("Square область：" + s1.area());
        System.out.println("Square периметр：" + s1.perimeter());

        System.out.println("Triangle область：" + t1.area());
        System.out.println("Triangle периметр：" + t1.perimeter());

    }
}

package test2;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        int length = sc.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int width = sc.nextInt();

        Rectangle z = new Rectangle();
        z.setLength(length);
        z.setWidth(width);

        System.out.println("периметр:"+z.Getgirth());
        System.out.println("область:"+z.Getarea());
    }

}

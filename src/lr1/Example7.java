package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner scan = new  Scanner(System.in);
        System.out.println("Пожалуйста, введите свое имя:");
        name = scan.next();
        System.out.println("Пожалуйста, введите свой возраст:");
        age = scan.nextInt();
        System.out.println("Меня зовут" + " " + name + " " + age + "лет");
    }

}

package homework;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите целое число:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binaryNum1 = The1stChapter.DecimalToBinaryByRecursion(num);
        System.out.println("Двоичное целое число:");
        System.out.println(binaryNum1);
        sc.close();
    }
}


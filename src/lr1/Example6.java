package lr1;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        String name;
        String surname;

        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите фамилию:");
        surname = scan.nextLine();
        System.out.println("Пожалуйста, введите имя:");
        name = scan.nextLine();
        System.out.println("Hello!" + surname + name);
    }
}

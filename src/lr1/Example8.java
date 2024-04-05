package lr1;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
public class Example8 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Пожалуйста, введите месяц:");
            String month = sc.next();

            System.out.println("Пожалуйста, введите дату:");
            int date = sc.nextInt();

            System.out.println("Пожалуйста, введите день недели:");
            String week = sc.next();


            System.out.println("сегодня"+ "  " + date + month + "  " + week);
}
}

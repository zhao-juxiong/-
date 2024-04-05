package lr1;
import java.util.Scanner;
public class Example9 {
        //输入月份，判断该月有多少天
        public static void main(String[] args) {
            // 读取键盘输入的值
            Scanner s = new Scanner(System.in);
            // 接收
            System.out.println("Пожалуйста, введите месяц от 1 до 12:");
            int m = s.nextInt();

            // 条件判断 1,3,5,7,8,10,12月为31天
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                System.out.println(m + "месяце 31 день.");
                // 条件判断 4，6，9，11月为30天
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                System.out.println(m + "месяце 30 день.");
            }else {
                System.out.println(m + "месяце 29/28 день.");
            }
        }
    }


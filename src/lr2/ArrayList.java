package lr2;
import java.util.Scanner;
public class ArrayList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пожалуйста, введите номер N и номер ретрита M:");
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }
            int count = 0;
            int sub = 0;
            int num = 0;

            while (count != n - 1) {

                if (arr[sub++] != 0) {
                    num++;
                }

                if (num == m) {
                    arr[sub] = 0;
                    count++;
                    num = 0;
                }

                if (sub == n) {
                    sub = 0;
                }
            }

            for (int i : arr) {
                if (i != 0) {
                    System.out.println(i);
                }
            }
            scanner.close();
        }
    }







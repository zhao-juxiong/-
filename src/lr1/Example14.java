package lr1;
import java.util.Scanner;
public class Example14 {



        public static void main(String[] args) {
            System.out.print("Пожалуйста, введите любое целое число：");
            Scanner s = new Scanner(System.in);
            int sum = 0;
            int t = s.nextInt();

            while(t!=0){
                sum = sum + t % 10 * 2;
                t = t / 10;
            }
            System.out.println("Сумма чисел：" + sum);
        }

    }
/*
 * 输入一个整数，计算它各位上数字的和。
 * (注意:是任意位的整数)
 */


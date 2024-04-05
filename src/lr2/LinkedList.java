package lr2;
import java.util.Scanner;
public class LinkedList {



        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.print("请输入排成一圈的人数：");
            int n = s.nextInt();
            boolean[] arr = new boolean[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = true;
            }

            int leftCount = n;
            int countNum = 0;
            int index = 0;
            while (leftCount > 1) {
                if (arr[index] == true) {
                    countNum++;
                    if (countNum == 3) {
                        countNum = 0;
                        arr[index] = false;
                        leftCount--;
                    }
                }
                index++;
                if (index == n) {
                    index = 0;
                }
            }
            for (boolean i : arr) {
                if (i ) {
                    System.out.println(i);
                }
            }
        }
    }




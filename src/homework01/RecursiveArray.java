package homework01;

import java.util.Scanner;

public class RecursiveArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入数组的大小：");
            int size = scanner.nextInt();

            int[] array = new int[size];
            System.out.println("请输入数组元素：");


            System.out.println("输入的数组为：");
            displayArray(array, size);

            scanner.close();
        }

        public static void displayArray(int[] array, int size) {
            displayArrayRecursively(array, size - 1);
        }

        public static void displayArrayRecursively(int[] array, int index) {
            if (index >= 0) {
                displayArrayRecursively(array, index - 1);
                System.out.print(array[index] + " ");
            }
        }
    }



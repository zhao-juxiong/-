package xingqiujueqi;

import java.util.Scanner;

public class Kaisa {
        public static void main(String[] args) {
            System.out.println("*****************************");
            System.out.println("******欢迎使用凯撒加密器******");
            System.out.println("*****************************");
            System.out.println("Пожалуйста, выберите действие（1.шифрование，2.покидать）：");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();//判断用户的选择
            switch(choice) {
                case 1:
                    System.out.println("Пожалуйста, введите зашифрованный контент：");
                    in.nextLine();
                    String jiami = in.nextLine();
                    Encryption enc = new Encryption();
                    System.out.println("Зашифрованный контент：");
                    enc.encryption(jiami);
                    break;

                case 2:
                    System.out.println("покидать");
            }

            in.close();

        }

    }

    //这是一个加密类









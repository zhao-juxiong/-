package test4;
import java.util.Random;
import java.util.Scanner;
public class BankAccount {

        String account_number;
        int leftmoney;
        public BankAccount() {
        }
    public BankAccount(String account_number, int leftmoney) {
            super();
            this.account_number = account_number;
            this.leftmoney = leftmoney;
        }
        public void savemoney(int money) {
            leftmoney += money;
        }
        public void getmoney(int money) {
            if (leftmoney > money) {
                leftmoney -= money;

            } else {
                System.out.println("баланс превышен!");
            }
        }

        public int getleftmoney() {
            return leftmoney;
        }

        public static void main(String[] args) {

            BankAccount ba = new BankAccount("1234", 500);
            ba.savemoney(2000);
            ba.getmoney(5000);
        }

    }


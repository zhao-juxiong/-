package xingqiujueqi;
import java.util.Scanner;
public class Encryption {

    public void encryption(String jiami) {
        char[] temp = jiami.toCharArray();
        int[] newtemp = new int[temp.length];
        //将字符数组转化为整型
        for (int i = 0; i < temp.length; i++) {
            newtemp[i] = temp[i];
        }
        //循环每个整型数组数值
        for (int i = 0; i < newtemp.length; i++) {
            //判断是否为小写字母
            if (newtemp[i] <= 122 && newtemp[i] >= 97) {
                if (newtemp[i] == 120) {
                    newtemp[i] = 97;
                } else if (newtemp[i] == 121) {
                    newtemp[i] = 98;
                } else if (newtemp[i] == 122) {
                    newtemp[i] = 99;
                } else {
                    newtemp[i] = newtemp[i] + 3;
                }
            }
            //判断是否为大写字母
            if (newtemp[i] <= 90 && newtemp[i] >= 65) {
                if (newtemp[i] == 88) {
                    newtemp[i] = 65;
                } else if (newtemp[i] == 89) {
                    newtemp[i] = 66;
                } else if (newtemp[i] == 90) {
                    newtemp[i] = 67;
                } else {
                    newtemp[i] = newtemp[i] + 3;
                }
            }
        }
        //输出字符
        for (int i = 0; i < newtemp.length; i++) {
            temp[i] = (char) newtemp[i];
            System.out.print(temp[i]);
        }

    }
}

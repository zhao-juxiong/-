package xingqiujueqi;

import java.util.Scanner;
public class Caesar {

    public static void main(String[] args){

        String temp="0";
        while(Integer.valueOf(temp).intValue()!=3)   //为3时跳出while
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("**************CaesarCipher**************");
            System.out.println("    1.明文加密             2.密文解密                 3.退出               ");
            System.out.println("****************************************");
            System.out.println("请选择菜单功能：");
            temp=sc.nextLine();
            while(isNum(temp)==false)
            {
                System.out.println("请重新选择：");
                temp=sc.nextLine();
            }
            switch(Integer.valueOf(temp).intValue())
            {
                case 1:
                {
                    System.out.println("请输入明文：");
                    String s=sc.nextLine();
                    s=s.replace(" ", "");             //去除空格！！！！！！
                    while(isStr(s)==false)          //判断是否全为字符
                    {
                        System.out.println("请重新输入明文：");
                        s=sc.nextLine();
                    }
                    System.out.println("请输入秘钥：");
                    String key1=sc.nextLine();
                    while(isNum(temp)==false)       //判断是否全为数字
                    {
                        System.out.println("秘钥必须是数字，请重新选择：");
                        key1=sc.nextLine();
                    }
                    Encryption(s,Integer.valueOf(key1).intValue());
                    System.out.println();          //换行
                    break;               		   //跳出switch
                }
                case 2:
                {
                    System.out.println("请输入密文：");          //与加密类似
                    String s=sc.nextLine();
                    s=s.replace(" ", "");
                    while(isStr(s)==false)
                    {
                        System.out.println("请重新输入密文：");
                        s=sc.nextLine();
                    }
                    System.out.println("请输入秘钥：");
                    String key1=sc.nextLine();
                    while(isNum(temp)==false)
                    {
                        System.out.println("秘钥必须是数字，请重新选择：");
                        key1=sc.nextLine();
                    }
                    Decrypt(s,Integer.valueOf(key1).intValue());
                    System.out.println();
                    break;
                }
                case 3:
                {
                    System.out.println("谢谢您的使用！");
                    break;
                }
            }

        }

    }

    public static boolean isStr(String str) {     //判断是否全为字符
        char[] chars=str.toCharArray();
        boolean isPhontic = false;
        for(int i = 0; i < chars.length; i++)
        {
            isPhontic = (chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z');
            if (!isPhontic) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNum(String str){      //判断是否全为数字
        for (int i = str.length();--i>=0;)
        {
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;

    }
    public static void Encryption(String str, int k) {  //加密
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')       //如果字符串中的某个字符是小写字母
            {
                c+=k%26;             //移动key%26位
                if(c<'a')
                    c+=26;           //向左超界
                if(c>'z')
                    c-=26;           //向右超界
            }
            if(c>='A'&&c<='Z')       //如果字符串中的某个字符是大写字母
            {
                c+=k%26;             //移动key%26位
                if(c<'a')
                    c+=26;           //向左超界
                if(c>'z')
                    c-=26;           //向右超界
            }
            string +=c;              //将解密后的字符连成字符串
        }
        //return string;
        System.out.println("加密后为："+string);
    }
    public static void Decrypt(String str, int n){    //解密
        int k=Integer.parseInt("-"+n);          //key=负n,其他与加密类似
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')                  //如果字符串中的某个字符是小写字母
            {
                c+=k%26;						//移动key%26位
                if(c<'a')
                    c+=26;						//向左超界
                if(c>'z')
                    c-=26;						//向右超界
            }else if(c>='A'&&c<='Z')			//如果字符串中的某个字符是大写字母
            {
                c+=k%26;						//移动key%26位
                if(c<'A')
                    c+=26;						//向左超界
                if(c>'Z')
                    c-=26;						//向右超界
            }
            string +=c;							//将解密后的字符连成字符串
        }
        //return string;
        System.out.println("解密后为："+string);
    }
}



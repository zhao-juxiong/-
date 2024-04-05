package dongwu;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Sunquan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[6];
        for(int i=1;i<=arr.length;i++) {
            System.out.println("请输入第"+i+"位整数，需要输入6位");
            arr[i-1] = s.nextInt();
        }
        // System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }


        //求该数组的最小值
        //最小值
        int min = arr[0];
        for(int i=0;i<arr.length;i++) {
            min = min<arr[i]?min:arr[i];
        }
        System.out.println("минимальное значение:"+min);

        //4.编写方法，参数有两个，一个是数组，一个是目标数组长度，把该数组扩容到指定目标长度。如果目标长度小于原数组，则返回原数组。

        arr = expansionArr(arr,12);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] expansionArr(int[] arr,int length) {

        if(arr.length>=length) {
            return arr;
        }
        int[] arr1 = new int[length];


        for(int i=0;i<arr.length;i++) {
            arr1[i] = arr[i];
        }
        return arr1;



    }
}

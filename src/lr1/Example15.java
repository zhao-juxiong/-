package lr1;
import java.util.*;
public class Example15 {
    public static void main(String[] args)throws Exception{

        Scanner s= new Scanner(System.in);
        System.out.print("Пожалуйста, введите первый номер：");
        float a=s.nextFloat();
        System.out.print("Пожалуйста, введите второй номер：");
        float b=s.nextFloat();
        System.out.println("Два числа："+(a+b));
        System.out.println("Разница между двумя числами состоит："+(a-b));

    }
}

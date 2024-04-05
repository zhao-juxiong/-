package test1;

import java.util.Scanner;
public class Shape {
    public static void main(String[]args) {
        Shape s=new Shape();
        Scanner sc=new Scanner(System.in);
        System.out.println("输入随机生成图形个数：");
        int N=sc.nextInt();
        shape ss[]=new shape[N+1];
        for(int i=0;i<N;i++){
            System.out.println("входная графика:\n1:треугольник\n2:круглый\n3:прямоугольник");
            int j=sc.nextInt();
            switch(j) {
                case 1:
                {
                    int a,b,c;
                    do {
                        System.out.print("Введите три стороны треугольника：");
                        a=sc.nextInt();
                        b=sc.nextInt();
                        c=sc.nextInt();
                        if(a+b<=c||a+c<=b||b+c<=a) {
                            System.out.println("数据不合法，请重新输入！");
                        }
                        else break;
                    }while(true);
                    ss[i]=s.new Triangle(a,b,c);
                    break;
                }
                case 2:
                {
                    System.out.print("Введите радиус круга：");
                    int rr;
                    rr=sc.nextInt();
                    ss[i]=s.new Circle(rr);
                    break;
                }
                case 3:
                {
                    System.out.print("Введите длину и ширину прямоугольника：");
                    int a,b;
                    a=sc.nextInt();
                    b=sc.nextInt();
                    ss[i]=s.new Rectangle(a,b);
                    break;
                }
            }
        }
        for(int i=0;i<N;i++) {
            ss[i].Getarea();
            ss[i].Showarea();
            ss[i].Getgirth();
            ss[i].Showgirth();
        }
        sc.close();
        return;
    }
    public abstract class shape{
        abstract void Getarea();

        abstract void Getgirth();

        public abstract void Showarea();

        public abstract void Showgirth();
    }
    public class Triangle extends shape{
        double area;
        int girth;
        int l1,l2,l3;

        public Triangle(int l1, int l2, int l3) {
            super();
            this.l1 = l1;
            this.l2 = l2;
            this.l3 = l3;
        }

        @Override
        void Getarea() {
            double p=(l1+l2+l3)/2.0;
            area=Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
        }

        @Override
        void Getgirth(){
            int p = l1 + l2 + l3;
            girth= (int) Math.random();
        }

        @Override
        public void Showarea() {
            System.out.println("Triangle area:"+area);
        }

        @Override
        public void Showgirth() {
            System.out.println("Triangle girth:"+girth);
        }


        
    }
    public class Circle extends shape{
        double area;
        double girth;
        int r;


        public Circle(int r) {
            super();
            this.r = r;
        }

        @Override
        void Getarea() {
            double PI=3.14159;
            area=PI*r*r;
        }

        @Override
        void Getgirth() {
            double PI=3.14159;
            girth=PI*r*2;

        }


        @Override
        public void Showgirth() {

        }

        @Override
        public void Showarea() {

        }
    }
    public class Rectangle extends shape{
        double area;
        double girth;
        int length,width;

        public Rectangle(int length, int width) {
            super();
            this.length = length;
            this.width = width;
        }

        @Override
        void Getarea() {
            area=length*width;
        }

        @Override
        void Getgirth() {
            girth=(length+width)*2;


        }

        @Override
        public void Showarea() {
            System.out.println("Rectangle area:"+area);
        }

        public void Showgirth() {
            System.out.println("Rectangle girth:"+girth);
        }

        

    }
}
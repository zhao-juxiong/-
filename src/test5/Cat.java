package test5;

public class Cat extends Animal{  //继承Animal父类



    public Cat(String name, Integer legNum) {
        super(name, legNum);
        setName(name);
        setLegNum(legNum);
    }

    public void shout() {
        System.out.print(getName() + " " + "есть" + getLegNum() + " " + "ноги\n");
    }
}



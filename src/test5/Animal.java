package test5;
public class Animal {
    private String name;
    private Integer legNum;
    public void shout() {
        System.out.print(name + " " + "есть" + legNum  + " " + "ноги.");
    }
    public Animal(String name,Integer legNum) {
        setName(name);
        setLegNum(legNum);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getLegNum() {
        return legNum;
    }
    public void setLegNum(Integer legNum) {
        this.legNum = legNum;
    }

}



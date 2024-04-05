package test;

public class Person {

    int age;

    String name;

    String gender;

    public Person(int Age, String Name, String Gender) {

        this.age = Age;

        this.name = Name;

        this.gender = Gender;

    }

    public String toString() {

        return "имя:" + name +" ，" + "пол:" + gender + "，" + "возраст:" + age;

    }
}


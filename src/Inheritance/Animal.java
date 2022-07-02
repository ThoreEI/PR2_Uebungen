package Inheritance;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public void makeSounds(){
        System.out.print("Animal makes: ");
    }

    public void haveFun() {
        System.out.print("I love to: ");
    }


}

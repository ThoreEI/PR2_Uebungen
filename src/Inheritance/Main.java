package Inheritance;

public class Main {
    public static void main(String[] args) {

        System.out.println("Big");
        Dog dog = new Dog ("Dog", 10, "Husky");
        dog.makeSounds();
        dog.haveFun();

        System.out.println("********************************************");


        System.out.println("Little");
        Dog littleDog = new LittleDog("Sweetie", 1, "LittleHusky");
        littleDog.makeSounds();
        littleDog.haveFun();


        // static type Dog --> see methods
        // dynamic type LittleDog --> chose the right method

    }
}



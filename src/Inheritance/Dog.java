package Inheritance;

public class Dog extends Animal {
    private String name;
    private int age;
    private final String type;

    public Dog (String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void haveFun() {
        super.haveFun();
        if (!(this instanceof LittleDog))
            System.out.println("catch a ball!");
    }

    public void sleep() {
        System.out.println("ZZZZZZZZ");
    }


    @Override
    public void makeSounds() {
        super.makeSounds();
        if (!(this instanceof LittleDog))
            System.out.println(" BARKBARK ");
    }

}

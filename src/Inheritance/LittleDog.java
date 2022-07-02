package Inheritance;

public final class LittleDog extends Dog {
    // final -> can't inherit

    public LittleDog(String name, int age, String type) {
        super(name, age, type);
    }

    public void sleep() {
        super.sleep();
        System.out.println(" the whole day");
    }

    @Override
    public void makeSounds() {
        super.makeSounds();
        System.out.println("wuff ");
    }

    @Override
    public void haveFun() {
        super.haveFun();
        System.out.println("Im learning things");
    }
}

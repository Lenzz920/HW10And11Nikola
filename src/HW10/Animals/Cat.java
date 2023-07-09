package HW10.Animals;

public class Cat extends Animal {

    final private static String catSound = "MEEOW";

    public Cat(String name, String favouriteFood){
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am " + name + " and my favourite food is " + favouriteFood + "\n" + catSound;
    }
}

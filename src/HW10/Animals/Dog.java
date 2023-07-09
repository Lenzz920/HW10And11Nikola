package HW10.Animals;

public class Dog extends Animal {

    final private static String dogSound = "DJAAF";

    public Dog(String name, String favouriteFood){
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return "I am " + name + " and my favourite food is " + favouriteFood + "\n" + dogSound;
    }
}

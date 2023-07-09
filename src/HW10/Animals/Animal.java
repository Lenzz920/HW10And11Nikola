package HW10.Animals;

public abstract class Animal {

    final protected String name;
    final protected String favouriteFood;

    public Animal(String name, String favouriteFood){
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public abstract String explainSelf();

}

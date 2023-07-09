package HW10.SayHello;

public abstract class Person {

    final private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public String getName() {
        return name;
    }
}

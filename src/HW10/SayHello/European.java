package HW10.SayHello;

public class European extends Person{

    public European(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}

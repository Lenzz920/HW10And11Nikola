package HW10.SayHello;

public class Bulgarian extends Person{

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравейте");
    }
}

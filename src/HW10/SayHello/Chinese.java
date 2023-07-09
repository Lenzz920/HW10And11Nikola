package HW10.SayHello;

public class Chinese extends Person{

    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("你好");
    }
}

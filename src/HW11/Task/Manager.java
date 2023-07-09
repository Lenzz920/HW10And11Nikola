package HW11.Task1;

public class Manager extends Employee{

    public Manager(String name, int age){
        super(name, age);
    }

    @Override
    public void jobDescription() {
        throw new RuntimeException("Can't tell you");
    }

}

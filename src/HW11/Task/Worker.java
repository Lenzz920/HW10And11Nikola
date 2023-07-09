package HW11.Task1;

public class Worker extends Employee{

    public Worker(String name, int age){
        super(name, age);
    }

    @Override
    public void jobDescription() {
        System.out.println("I'm a worker");
    }
}

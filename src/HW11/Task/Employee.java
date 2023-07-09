package HW11.Task1;

public abstract class Employee {

    final protected String name;
    protected int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
        }

        public abstract void jobDescription();
}


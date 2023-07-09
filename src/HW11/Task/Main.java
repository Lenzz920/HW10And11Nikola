package HW11.Task1;

public class Main {

    public static void main(String[] args) {
        Employee m = new Manager("Bob", 40);
        Employee w = new Worker("John", 24);

        w.jobDescription();
        m.jobDescription();
    }

}

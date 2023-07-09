package HW11.Task;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee m = new Manager("Bob", 40, 15);
        Employee w1 = new Worker("John", 24, 3);
        Employee w2 = new Worker("Smith", 24, 3);
        Employee w3 = new Worker("Ben", 24, 3);
        Employee w4 = new Worker("Hal", 24, 3);

        Company c = new Company("Coca-Cola");

        c.addOneEmployee(m);
        c.addOneEmployee(w1);

        c.printEmployeesInfo();
        System.out.println();

        List<Employee> newHires = new ArrayList<>();
        newHires.add(w2);
        newHires.add(w3);
        newHires.add(w4);

        c.addManyEmployees(newHires);
        c.printEmployeesInfo();

        System.out.println("\nnext");

        w2.addBenefit("Beef");
        w2.printBenefits();

        m.addBenefit("Car");
        m.printBenefits();

        m.addBenefit("Insurance");
        m.printBenefits();

        m.addBenefit("Additional paid leave");
        m.printBenefits();

        m.addBenefit("Home office");
        m.printBenefits();
    }

}

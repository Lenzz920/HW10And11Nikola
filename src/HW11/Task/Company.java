package HW11.Task;

import java.util.ArrayList;
import java.util.List;

public class Company {

    final private String companyName;
    List<Employee> employees = new ArrayList<>();

    public Company(String companyName){
        this.companyName = companyName;
    }

    public void addOneEmployee(Employee employee){
        employees.add(employee);
    }

    public void addManyEmployees(List<Employee> addEmployees){
        employees.addAll(addEmployees);
    }

    public void printEmployeesInfo(){
        System.out.println("Those are the employees that work here");
        for(Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

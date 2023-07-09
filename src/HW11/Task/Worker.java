package HW11.Task;

public class Worker extends Employee{

    final protected boolean rightsForBenefits = false;

    public Worker(String name, int age, int ageInCompany){
        super(name, age, ageInCompany);
    }

    @Override
    public void jobDescription() {
        System.out.println("I'm a worker");
    }

    @Override
    protected boolean getRightsForBenefits() {
        return false;
    }

}

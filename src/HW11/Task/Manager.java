package HW11.Task;

public class Manager extends Employee{

    public Manager(String name, int age, int ageInCompany){
        super(name, age, ageInCompany);
    }

    @Override
    public void jobDescription() {
        throw new RuntimeException("Can't tell you");
    }

    @Override
    protected boolean getRightsForBenefits() {
        return true;
    }
}

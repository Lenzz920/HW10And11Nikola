package HW11.Task;

public abstract class Employee {

    final protected String name;
    protected int age;
    protected int ageInCompany;
    private String[] benefits = new String[3];

    public Employee(String name, int age, int ageInCompany){
        this.name = name;
        this.age = age;
        this.ageInCompany = ageInCompany;
        }

    public abstract void jobDescription();
    protected abstract boolean getRightsForBenefits();

    @Override
    public String toString(){
        return "The name of this employee is " + name +
                " ,and he is " + age + " years old, and he is working in this company for " +
                ageInCompany + " years.";
    }

    public void addBenefit(String benefit) {
        if(getRightsForBenefits()) {
            for(int i = 0; i < benefits.length; i++){
                if(benefits[i] == null) {
                    benefits[i] = benefit;
                    break;
                } else if(benefits[2] != null) {
                    throw new RuntimeException("You can't have more than 3 benefits");
                }
            }
        } else
            throw new RuntimeException("You are not allegeable to benefits");
    }

    public void printBenefits() {
        System.out.println();
        for(int i = 0; i < benefits.length; i++){
            if(benefits[i] == null) {
                break;
            }
            System.out.println(benefits[i]);
        }
    }

}


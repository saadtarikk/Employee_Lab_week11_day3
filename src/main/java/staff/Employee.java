package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrement) {
        if(this.salary > 0){
         double increment = (int) (this.salary * salaryIncrement);
         this.salary += increment;}
    }

    public double payBonus() {
        return this.salary * 0.1;
    }

    public void setName(String name) {
        this.name = name;
    }
}

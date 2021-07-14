package staff.management;

import staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String niNumber, int salary, double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}

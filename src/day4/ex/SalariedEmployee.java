package day4.ex;

public class SalariedEmployee extends Employee{

    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                "} " + super.toString();
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}

package day3.ex;

public class CommonEmployee extends Employee{
    private double bonus;
    public CommonEmployee() {
    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通打工人,");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "CommonEmployee{" +
                "bonus=" + bonus  + super.toString()
                +
                "} ";
    }
}

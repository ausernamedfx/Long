package day3.ex;

public class Manage extends Employee {
    private double bonus;

    public Manage() {
    }

    // 抽象类中的抽象方法,子类必须重写
    @Override
    public void work() {
        System.out.println("管理员工,提高公司运行效率");
    }

    public Manage(double bonus) {
        this.bonus = bonus;
    }

    public Manage(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manage{" +
                "bonus=" + bonus +
                 super.toString() + "}" ;
    }
}

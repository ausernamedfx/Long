package day4.ex;

public class HourlyEmployee extends Employee{
    private int wage;
    private int hour;



    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public double earnings() {
        return 0;
    }
}

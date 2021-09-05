package day4.ex;

public class HourlyEmployee extends Employee{
    private int wage;
    private int hour;



    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.hour = hour;
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return 0;
    }
}

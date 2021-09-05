package day4.ex;



public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];


        emps[0] = new SalariedEmployee("马森",1002,
                new MyDate(1992,2,28),10000);
        emps[1] = new HourlyEmployee("张三",2001,
                new MyDate(1998,10,16),60,240);

        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i]);
            emps[i].earnings();
        }
    }
}

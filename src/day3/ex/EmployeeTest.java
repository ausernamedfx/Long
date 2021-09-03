package day3.ex;

public class EmployeeTest {
    public static void main(String[] args) {
        Manage manageWang = new Manage("王老板",101,10000,3000);
        CommonEmployee commonEmployee = new CommonEmployee("张三",999,1340);
        manageWang.work();
        commonEmployee.work();

        System.out.println("-----------------");

        System.out.println(commonEmployee.toString());
        System.out.println(manageWang.toString());
    }
}

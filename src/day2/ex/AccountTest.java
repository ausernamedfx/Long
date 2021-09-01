package day2.ex;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account();
        Account acc2 = new Account("123456", 4000);
        Account.setMinBanlance(100);
        Account.setInterestRate(0.01);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc1.getInterestRate());
    }
}

package day2.ex;

public class Account {
    private int id;
    private String pwd = "000000";
    private double balance;
    private static double interestRate;
    private static double minBanlance = 1.0;
    private static int init = 1001;

    public Account() {
        id = init++;
    }
    public Account(String pwd,double balance){
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static int getInit() {
        return init;
    }

    public String getPws() {
        return pwd;
    }

    public void setPws(String pwd) {
        this.pwd = pwd;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBanlance() {
        return minBanlance;
    }

    public static void setMinBanlance(double minBanlance) {
        Account.minBanlance = minBanlance;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}

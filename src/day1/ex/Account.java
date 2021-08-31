package day1.ex;

public class Account {
    private String id;
    private String password;
    private double balance;
    private static double interestRate;
    private double minBalance;


    public Account() {
    }

    public Account(String id, String password, double balance, double minBalance) {
        this.id = id;
        this.password = password;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Account.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}

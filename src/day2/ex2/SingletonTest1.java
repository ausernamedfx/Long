package day2.ex2;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}


// 饿汉式
class Bank{

    //1 私有化类的构造器
    private Bank(){

    }
    //2 内部创建类的对象
    private static Bank instance = new Bank();

    // 提供公共的方法,返回类的对象
    public static Bank getInstance(){
        return instance;
    }




}
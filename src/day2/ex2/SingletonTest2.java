package day2.ex2;

public class SingletonTest2 {
    public static void main(String[] args) {
        Order or1 = Order.getInstance();
        Order or2 = Order.getInstance();
        System.out.println(or1 == or2);
    }
}


//懒汉式
class Order{

    //私有化构造器
    private Order(){

    }
    //声明当前对象.没有初始化
    private static Order instance = null;

    //用到了再初始化,所以叫懒汉式
    public static Order getInstance(){
        if (instance == null){
            instance = new Order();
        }

        return instance;
    }

}

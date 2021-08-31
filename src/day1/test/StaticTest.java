package day1.test;

import javax.swing.text.AsyncBoxView;

public class StaticTest {
    public static void main(String[] args) {

//        System.out.println("hello");

        Chinese c1 = new Chinese();
        c1.age = 24;
        c1.name = "LiWei";

        Chinese c2 = new Chinese();
        c2.age = 27;
        c2.name = "ZhangWei";

//        c1.nation = "CHN";
        c2.nation = "China";
        System.out.println(c2.nation);
        System.out.println(c1.nation);

        Chinese.show();
//        Chinese.eat();

    }
}

class Chinese{
    String name;
    int age;
    // 静态变量,静态属性
    static String nation;

    public void eat(){
        System.out.println("eat");
    }
    public static void show(){
        System.out.println("hh");
    }


}
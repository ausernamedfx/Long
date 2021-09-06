package day5.java8Interface;

public class SubClassTest {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        //错误的
//        s.method1();
        // 接口中的静态方法，只能通过接口调用
        CompareA.method1();

        // 通过实现类可以调用接口中的默认方法
        // 如果实现类重写了接口中的默认方法，则调用重写后的方法
        s.method2();

        // 默认用父类的，类优先原则
        s.method3();
    }
}
class SubClass extends SuperClass implements CompareA,CompareB{

    @Override
    public void method2() {
        System.out.println("SubClass: 上海");
    }

    @Override
    public void method3() {
        System.out.println("Subclass:shenzhen");
    }
}
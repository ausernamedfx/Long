package day5.jiekou;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        Plane plane = new Plane();
        plane.fly();

//        Flyable.MIN_SPEED = 2;

    }

}


// 用类实现接口 implements

interface Flyable{
    // 全局常量
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED = 1;

    // 抽象方法
    public abstract void fly();
    void stop();

}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

abstract class Kite implements Flyable{

    @Override
    public void fly() {
        System.out.println("飞飞飞");
    }
}

class Bullet extends Object implements Flyable,CC{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}



interface AA{
    void method1();
}

interface BB{
    void method2();
}


interface CC extends AA,BB{

}
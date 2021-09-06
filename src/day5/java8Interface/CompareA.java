package day5.java8Interface;
/*
*
* jdk8 定义静态方法
*
*
*
* */
public interface CompareA {
    // 静态方法
    static void method1(){
        System.out.println("CompareA:北京");
    }

    //默认方法
    default void method2(){
        System.out.println("CompareA:上海");
    }


    default void method3(){
        System.out.println("CompareA:上海");
    }
}

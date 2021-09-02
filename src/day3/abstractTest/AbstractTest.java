package day3.abstractTest;

// 抽象方法,抽象类

public class AbstractTest {
    public static void main(String[] args) {
        // 不可实例化
//        Person p1 = new Person();
//        p1.eat();
        // aa



//        Student s1 = new Student();
//        s1.eat();
    }
}

abstract class Person{
    String name;
    int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    // 抽象方法;包含抽象方法的类,一定是一个抽象类
    public abstract void eat();
    public void walk(){
        System.out.println("zou");
    }
}

class Creature{

}
class Student extends Person{


    public Student(String name, int age){
        super(name,age);
    }

    @Override
    public void eat() {

    }
}
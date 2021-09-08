package day6;

//内部类

public class InnerClassTest {
    public static void main(String[] args) {

        Person.Dog test = new Person.Dog();

        test.show();



    }
}

class Person{
    String name;
    int age;
    public void show(){
        System.out.println("nishuonimane");
    }

    //静态成员内部类
    static class Cat{

        private int number;

    }

    //非静态成员内部类
    static class Dog{

        String name;
        void show(){
            System.out.println("gou");
        }
    }

    public void method(){
        class AA{



        }
    }

    {
        class BB{

        }

    }
    public Person(){
        class CC{

        }
    }
}
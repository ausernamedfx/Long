package day2.DaiMaKuai;

//类的成员4:代码块
public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        Person person = new Person();
        System.out.println(person.age);
        Person.info();
        System.out.println(Person.desc);

    }
}

class Person{
    String name;
    int age;
    static String desc = "我是一个人";

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    // 代码块的作用:初始化当前的类和对象
    //只能用static修饰
    // 静态代码块,非静态代码快

    static {
        System.out.println("hello,static block!");
        desc = "我是一个爱学习的人";
    }

    static {
        System.out.println("hello ,static block 2");
    }

    {
        System.out.println("hi!,非静态代码块");
        age = 1;
    }

    public void eat(){
        System.out.println("eat!!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void info(){
        System.out.println("happy people");
    }
}
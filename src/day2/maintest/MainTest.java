package day2.maintest;


// 程序的入口


public class MainTest {

    public static void main(String[] args) {

        Main.main(new String[100]);
        show();
    }
    public static void show(){
        System.out.println("hi!");
    }
}


class Main{
    public static void main(String[] args) {
//        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}
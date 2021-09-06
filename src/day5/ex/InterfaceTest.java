package day5.ex;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(2.1);
        ComparableCircle comparableCircle2 = new ComparableCircle(2.4);
        int i = comparableCircle1.compareTo(comparableCircle2);

        if (i == 0){
            System.out.println("=");
        }else if (i < 0){
            System.out.println("<");
        }else {
            System.out.println(">");
        }

    }
}

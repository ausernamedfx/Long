package day7;

import org.junit.Test;

public class ExceptionTest {

    @Test
    public void test1(){
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(arr[2]);
    }
}

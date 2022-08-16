package TestArray;

import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        RunMethod run = new RunMethod();
        int n = 0;
        String[] baseArr;
        baseArr = new String[]{"test0","test1"};
        String newElem = "Hello";
        int length = baseArr.length;
        n = length + 1;
        baseArr = run.goodArr(n, baseArr, newElem);

        System.out.print(Arrays.toString(baseArr));
    }
        /*public static String[] goodArr ( int n, String[] baseArr, String newElem){
            String[] newArr = new String[n];
            for (int i = 0; i < n; i++) {
                newArr[i] = baseArr[i];
            }
            newArr[n] = newElem;

            return newArr;
        }*/
    }







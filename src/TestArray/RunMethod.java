package TestArray;

public class RunMethod {
    public static String[] goodArr ( int n, String[] baseArr, String newElem){
        String[] newArr = new String[n];
        for (int i = 0; i < baseArr.length; i++) {
            newArr[i] = baseArr[i];
        }
        newArr[n-1] = newElem;

        return newArr;
    }
}

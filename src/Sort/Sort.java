package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Sort {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

//        System.out.println("До сортировки:");
//        System.out.println(list);
//        long timeStart = System.currentTimeMillis();
        for (int k = list.size() - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i, i + 1);
                    list.set(i + 1, temp);
                }
            }

            System.out.println(list.toString());


//        Integer[] randomArray = new Integer[100000];
//        for (int i = 0; i < 100000; i++){
//            randomArray[i] = i;
//        }
//
//        System.out.println("Массив до сортировки пузырьком");
//        System.out.println(Arrays.toString(randomArray));
//        long timeStart = System.currentTimeMillis();
//        for(int k = randomArray.length - 1; k > 0; k--){
//            for(int i = 0; i < k; i++){
//                if(randomArray[i] < randomArray[i + 1]){
//                    int temp = randomArray[i];
//                    randomArray[i] = randomArray[i + 1];
//                    randomArray[i + 1] = temp;
//                }
//            }
//        }
//        long timeStop = System.currentTimeMillis();
//
//        System.out.println();
//        System.out.println();
//        System.out.println("массив после сортировки пузырьком, время сортировки " + (timeStop - timeStart) + " милисекунд");
//        System.out.print(Arrays.toString(randomArray));

//        long timeStartCollectionsSort = System.currentTimeMillis();
//        Collections.sort(randomArray);
//        long timeStopCollectionsSort = System.currentTimeMillis();
//        System.out.println("сортировка Collections.sort(), время сортировки " + (timeStopCollectionsSort - timeStartCollectionsSort) + " милисекунд");
//        System.out.println(randomArray);

        }
    }
}

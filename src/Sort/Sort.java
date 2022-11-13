package Sort;


import java.util.*;


public class Sort {

    public static void main(String[] args) {
        Random getRandom = new Random();
        Integer[] randomArray = new Integer[100000];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++){
            randomArray[i] = getRandom.nextInt(1,100000);
        }

        System.out.println("Массив до сортировки пузырьком");
        System.out.println(Arrays.toString(randomArray));

        long timeStart = System.currentTimeMillis();
        for(int k = randomArray.length - 1; k > 0; k--) {
            for (int i = 0; i < k; i++) {
                if (randomArray[i] > randomArray[i + 1]) {
                    int temp = randomArray[i];
                    randomArray[i] = randomArray[i + 1];
                    randomArray[i + 1] = temp;
                }
            }
        }
        long timeStop = System.currentTimeMillis();

        System.out.println();
        System.out.println();
        System.out.println("массив после сортировки пузырьком, время сортировки " + (timeStop - timeStart) + " миллисекунд");
        System.out.println(Arrays.toString(randomArray));


////        Сортировка методом Arrays.sort();
//        long timeStartArraysSort = System.currentTimeMillis();
//        Arrays.sort(randomArray);
//        long timeStopArraysSort = System.currentTimeMillis();
//        System.out.println("Массив после сортировки методом Arrays.sort, время сортировки "
//                           + (timeStopArraysSort - timeStartArraysSort) + " миллисекунд");
//        System.out.println(Arrays.toString(randomArray));


////        Cортировка методом Collections.sort();
//        Collections.addAll(addSegmentsFromANumber, randomArray);
//        long timeStartCollectionsSort = System.currentTimeMillis();
//        Collections.sort(addSegmentsFromANumber);
//        long timeStopCollectionsSort = System.currentTimeMillis();
//        System.out.println("сортировка Collections.sort(), время сортировки "
//                          + (timeStopCollectionsSort - timeStartCollectionsSort) + " миллисекунд");
//        System.out.println(addSegmentsFromANumber);

        }
    }


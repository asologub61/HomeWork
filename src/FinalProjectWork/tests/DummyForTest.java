package FinalProjectWork.tests;

import java.util.ArrayList;

public class DummyForTest {

    int numberDummyForSplitASegmentToDigits = 123;
    int numberDummyForPositiveTest = 321654987;
    int numberDummyForLowValueTest = 0;
    int numberDummyForHighValueTest  = 2147483647;
    int numberDummyForNegativeValueTest  = -2147483646;
    Integer numberDummyForNotNullTest = null;

    ArrayList segmentsFromANumber = addSegmentsFromANumber();
    ArrayList stringFromNumbersSegments = addStringFromNumbersSegments();

//    ArrayList list = new ArrayList(List.of());

    public ArrayList addStringFromNumbersSegments(){
        ArrayList list = new ArrayList<>();
        list.add(" триста двадцать один");
        list.add(" шестьсот пятьдесят четыре");
        list.add(" девятьсот восемьдесят семь");
        return list;

    }
    public ArrayList addSegmentsFromANumber() {
        ArrayList list = new ArrayList<>();
        list.add(321);
        list.add(654);
        list.add(987);
        return list;
    }



}

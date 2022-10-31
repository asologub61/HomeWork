package FinalProjectWork;

import java.util.ArrayList;
import java.util.Collections;

public class Spliter {

    private  Integer number;

    public Spliter(Integer number){
        this.number = number;
    }
    Values value = new Values();

    private ArrayList<Integer> segmentToANumber = this.splitNumberToSegments(getNumber());
    private ArrayList<String> stringFromNumber = this.numberToString(value,segmentToANumber, getNumber());

    private Integer[] splitASegmentToDigits(Integer seg) {

        Integer[] dropSeg = new Integer[3];
        dropSeg[0] = seg / 100;
        dropSeg[1] = seg % 100 / 10;
        dropSeg[2] = seg % 10;

        return dropSeg;
    }

    private ArrayList splitNumberToSegments(Integer number) {


        ArrayList segments = new ArrayList();
        while (number > 999) {
            int seg = number / 1000;
            segments.add(number - (seg * 1000));
            number = seg;
        }
        segments.add(number);
        Collections.reverse(segments);
        return segments;
    }

    private  ArrayList numberToString (Values value, ArrayList segmentsToANumber, int number) {
        ArrayList<String> NumberAsString =  new ArrayList();
        int level = segmentsToANumber.size() - 1;
        if(number == 0 ){
            NumberAsString.add(" ноль");}
        for (int i = 0; i < segmentsToANumber.size(); i++) {
            Integer[] segmentToNumbers = this.splitASegmentToDigits((Integer) segmentsToANumber.get(i));

            if (level - 1 == 0 && segmentToNumbers[1] != 1) {
                NumberAsString.add(value.getValue100()[segmentToNumbers[0]] + value.getValue10()[segmentToNumbers[1]] + value.getValue1()[1][segmentToNumbers[2]]);
            } else if (segmentToNumbers[1] != 1) {
                NumberAsString.add(value.getValue100()[segmentToNumbers[0]] + value.getValue10()[segmentToNumbers[1]] + value.getValue1()[0][segmentToNumbers[2]]);
            } else {
                NumberAsString.add(value.getValue100()[segmentToNumbers[0]] + value.getValue11()[segmentToNumbers[2]]);
            }
            level--;
        }
        return NumberAsString;
    }

    public ArrayList<Integer> getSegmentToANumber() {
        return segmentToANumber;
    }

    public  ArrayList<String> getStringFromNumber(){
        return stringFromNumber;
    }

    public Integer getNumber() {
        return number;
    }

}

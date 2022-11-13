package FinalProjectWork;

import java.util.ArrayList;
import java.util.Collections;

public class Spliter {

    public int[] splitASegmentToDigits(int seg) {

        int[] takeSeg = new int[3];
        takeSeg[0] = seg / 100;
        takeSeg[1] = seg % 100 / 10;
        takeSeg[2] = seg % 10;

        return takeSeg;
    }

   public ArrayList splitNumberToSegments(int number) {


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

    public  ArrayList numberToString (Values value, ArrayList segmentsFromANumber, int number) {
        ArrayList<String> NumberAsString =  new ArrayList();
        int level = segmentsFromANumber.size() - 1;
        if(number == 0 ){
            NumberAsString.add(" ноль");}
        for (int i = 0; i < segmentsFromANumber.size(); i++) {
            int[] segmentToNumbers = this.splitASegmentToDigits((Integer) segmentsFromANumber.get(i));

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

}

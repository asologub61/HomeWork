package FinalProjectWork;

import java.util.ArrayList;
import java.util.Scanner;

public class CastMoney {
//    Scanner scanner = new Scanner(System.in);
    CurrencyWithForms currency = new CurrencyWithForms();
    Spliter spliter = new Spliter();
    Values value = new Values();


//         public ArrayList numberToString (Spliter spliter, Values value, ArrayList segmentsToANumber, int number) {
//             ArrayList<String> NumberAsString =  new ArrayList();
//             int level = segmentsToANumber.size() - 1;
//             if(number == 0 ){
//                 NumberAsString.add(" ноль");}
//             for (int i = 0; i < segmentsToANumber.size(); i++) {
//                 Integer[] segmentToNumbers = spliter.splitASegmentToDigits((Integer) segmentsToANumber.get(i));
//
//                 if (level - 1 == 0 && segmentToNumbers[1] != 1) {
//                     NumberAsString.add(value.getValue100()[segmentToNumbers[0]] + value.getValue10()[segmentToNumbers[1]] + value.getValue1()[1][segmentToNumbers[2]]);
//                 } else if (segmentToNumbers[1] != 1) {
//                     NumberAsString.add(value.getValue100()[segmentToNumbers[0]] + value.getValue10()[segmentToNumbers[1]] + value.getValue1()[0][segmentToNumbers[2]]);
//                 } else {
//                     NumberAsString.add(value.getValue100()[segmentToNumbers[0]] + value.getValue11()[segmentToNumbers[2]]);
//                 }
//                  level--;
//                 }
//             return NumberAsString;
//         }

//         public String addFormsAndCurrency(ArrayList stringFromNumber, ArrayList segmentsToANumber){
//             int level = segmentsToANumber.size() - 1;
//             String peaceOfNumber = "";
//             String stringNumber = "";
//             for( int i = 0; i < segmentsToANumber.size(); i++){
//             if (stringFromNumber.get(i).equals("") && level != 0) {
//                     peaceOfNumber = (String) stringFromNumber.get(i);
//                 } else {
//                     peaceOfNumber = stringFromNumber.get(i) + currency.addForms((Integer) segmentsToANumber.get(i), currency.getFormsOfWords()[level][0],
//                             currency.getFormsOfWords()[level][1], currency.getFormsOfWords()[level][2]);
//                 }
//                 stringNumber += peaceOfNumber;
//                 level--;
//             }
//             return stringNumber;
//         }
         public void doCastMoney(int number){
//             System.out.println("Введите число:");
//             int number = scanner.nextInt();
                     try {
                     ArrayList segmentsFromANumber = spliter.splitNumberToSegments(number);
                     ArrayList stringFromNumbersSegments = spliter.numberToString(value, segmentsFromANumber, number);
                     String castToWords = currency.addFormsAndCurrency(stringFromNumbersSegments, segmentsFromANumber);
                     castToWords = castToWords.substring(1, 2).toUpperCase() + castToWords.substring(2);
                     System.out.println(castToWords);
                 } catch (Exception e) {
                     System.err.println("В качестве значения можно ввести только целое число больше нуля");
                     System.err.println(e);
                 }
         }
    }


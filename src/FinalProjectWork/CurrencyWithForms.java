package FinalProjectWork;

import java.util.ArrayList;

public class CurrencyWithForms {

    private String[][] formsOfWords = new String[][]{{" рубль", " рубля", " рублей"},
                                            {" тысяча", " тысячи", " тысяч"},
                                            {" миллион", " миллиона", " миллионов",},
                                            {" миллиард", " миллиарда", " миллиардов"}};


    private String[][] getFormsOfWords(){
        return this.formsOfWords;
    }

    private String addForms(Integer integer, String forms0, String forms1, String forms2) {
        integer = integer % 100;
        int n = integer % 10;
        if (integer >= 10 & integer < 20) return forms2;
        if (n > 1 & n < 5) return forms1;
        if (n == 1) return forms0;
        return forms2;
    }

    public String addFormsAndCurrency(ArrayList stringFromNumber, ArrayList segmentsToANumber){
        int level = segmentsToANumber.size() - 1;
        String peaceOfNumber = "";
        String stringNumber = "";
        for( int i = 0; i < segmentsToANumber.size(); i++){
            if (stringFromNumber.get(i).equals("") && level != 0) {
                peaceOfNumber = (String) stringFromNumber.get(i);
            } else {
                peaceOfNumber = stringFromNumber.get(i) + this.addForms((Integer) segmentsToANumber.get(i), this.getFormsOfWords()[level][0],
                        this.getFormsOfWords()[level][1], this.getFormsOfWords()[level][2]);
            }
            stringNumber += peaceOfNumber;
            level--;
        }
        return stringNumber;
    }
}

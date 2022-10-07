package FinalProjectWork;

import java.util.HashMap;
import java.util.Scanner;

public class ProjectWork {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число:");
        Integer num = scanner.nextInt();
        String number = num.toString();
        char[] numberChar = number.toCharArray();


        HashMap<Character, String> edinici = new HashMap<>();
        edinici.put('1', "один");
        edinici.put('2', "два");
        edinici.put('3', "три");
        edinici.put('4', "четыре");
        edinici.put('5', "п€ть");
        edinici.put('6', "шесть");
        edinici.put('7', "семь");
        edinici.put('8', "восемь");
        edinici.put('9', "дев€ть");

        String[] odnaDve = new String[]{"одна", "две"};

        HashMap<Character, String> desyatki = new HashMap<>();
        desyatki.put('1', "дес€ть");
        desyatki.put('2', "двадцать");
        desyatki.put('3', "тридцать");
        desyatki.put('4', "сорок");
        desyatki.put('5', "п€тьдес€т");
        desyatki.put('6', "шестьдес€т");
        desyatki.put('7', "семьдес€т");
        desyatki.put('8', "восемьдес€т");
        desyatki.put('9', "дев€носто");


        HashMap<Character, String> odinadtcat = new HashMap<>();
        odinadtcat.put('1', "одиннадцать");
        odinadtcat.put('2', "двенадцать");
        odinadtcat.put('3', "тринадцать");
        odinadtcat.put('4', "четырнадцать");
        odinadtcat.put('5', "п€тнадцать");
        odinadtcat.put('6', "шестнадцать");
        odinadtcat.put('7', "семнадцать");
        odinadtcat.put('8', "восемнадцать");
        odinadtcat.put('9', "дев€тнадцать");

        HashMap<Character, String> sotni = new HashMap<>();
        sotni.put('1',"сто");
        sotni.put('2',"двести");
        sotni.put('3',"триста");
        sotni.put('4',"четыреста");
        sotni.put('5',"п€тьсот");
        sotni.put('6',"шестьсот");
        sotni.put('7',"семьсот");
        sotni.put('8',"восемьсот");
        sotni.put('9',"дев€тьсот");

        String[] thousendMillionMilliarldBlock = new String[]{"тыс€ча", "тыс€чи", "тыс€ч",
                "миллион", "миллиона", "миллионов",
                "миллиард", "миллиарда", "миллиардов",};
        String[] currency = new String[]{"рубль", "рубл€", "рублей"};

        if (numberChar.length == 1 && numberChar[0] != '0') {
            String value = edinici.get(numberChar[0]);
            if (value == "один") {
                System.out.println(value + " " + currency[0]);
            } else if (value == "два" || value == "три" || value == "четыре") {
                System.out.println(value + " " + currency[1]);
            } else {
                System.out.println(value + " " + currency[2]);
            }
        } else if (numberChar.length == 1 && numberChar[0] == '0') {
            System.out.println("ноль " + currency[2]);
        }

        if (numberChar.length == 2 && numberChar[1] == '0') {
            String value = desyatki.get(numberChar[0]);
            System.out.println(value + " " + currency[2]);
        } else if (numberChar.length == 2 && numberChar[0] != '1') {
            String digitOne = desyatki.get(numberChar[0]);
            String digitTwo = edinici.get(numberChar[1]);
            if (digitTwo == "один") {
                System.out.println(digitOne + " " + digitTwo + " " + currency[0]);
            } else if ((digitTwo == "два") || (digitTwo == "три") || (digitTwo == "четыре")) {
                System.out.println(digitOne + " " + digitTwo + " " + currency[1]);
            } else {
                System.out.println(digitOne + " " + digitTwo + " " + currency[2]);
            }
        }

        if (numberChar.length == 2 && numberChar[0] == '1') {
            String value = odinadtcat.get(numberChar[1]);
            System.out.println(value + " " + currency[2]);
        }

        if (numberChar.length == 3){
            String digitOne = sotni.get(numberChar[0]);
            String digitTwo = desyatki.get(numberChar[1]);
            String digitThree = edinici.get(numberChar[2]);
            String digitTwoAndThree = odinadtcat.get(numberChar[2]);
            if (numberChar[1] == '1'){
                System.out.println(digitOne + " " + digitTwoAndThree + " " + currency[2]);
            } else if (numberChar[2] == '1') {
                System.out.println(digitOne + " " + digitTwo + " " + digitThree + " " + currency[0]);
            } else if (numberChar[2] == '2' || numberChar[2] == '3' || numberChar[2] == '4') {
                System.out.println(digitOne + " " + digitTwo + " " + digitThree + " " + currency[1]);
            }else if (numberChar.length == 3) {
                System.out.println(digitOne + " " + digitTwo + " " + digitThree + " " + currency[2]);
            }

            }
        }
    }




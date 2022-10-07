package FinalProjectWork;

import java.util.HashMap;
import java.util.Scanner;

public class ProjectWork {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����:");
        Integer num = scanner.nextInt();
        String number = num.toString();
        char[] numberChar = number.toCharArray();


        HashMap<Character, String> edinici = new HashMap<>();
        edinici.put('1', "����");
        edinici.put('2', "���");
        edinici.put('3', "���");
        edinici.put('4', "������");
        edinici.put('5', "����");
        edinici.put('6', "�����");
        edinici.put('7', "����");
        edinici.put('8', "������");
        edinici.put('9', "������");

        String[] odnaDve = new String[]{"����", "���"};

        HashMap<Character, String> desyatki = new HashMap<>();
        desyatki.put('1', "������");
        desyatki.put('2', "��������");
        desyatki.put('3', "��������");
        desyatki.put('4', "�����");
        desyatki.put('5', "���������");
        desyatki.put('6', "����������");
        desyatki.put('7', "���������");
        desyatki.put('8', "�����������");
        desyatki.put('9', "���������");


        HashMap<Character, String> odinadtcat = new HashMap<>();
        odinadtcat.put('1', "�����������");
        odinadtcat.put('2', "����������");
        odinadtcat.put('3', "����������");
        odinadtcat.put('4', "������������");
        odinadtcat.put('5', "����������");
        odinadtcat.put('6', "�����������");
        odinadtcat.put('7', "����������");
        odinadtcat.put('8', "������������");
        odinadtcat.put('9', "������������");

        HashMap<Character, String> sotni = new HashMap<>();
        sotni.put('1',"���");
        sotni.put('2',"������");
        sotni.put('3',"������");
        sotni.put('4',"���������");
        sotni.put('5',"�������");
        sotni.put('6',"��������");
        sotni.put('7',"�������");
        sotni.put('8',"���������");
        sotni.put('9',"���������");

        String[] thousendMillionMilliarldBlock = new String[]{"������", "������", "�����",
                "�������", "��������", "���������",
                "��������", "���������", "����������",};
        String[] currency = new String[]{"�����", "�����", "������"};

        if (numberChar.length == 1 && numberChar[0] != '0') {
            String value = edinici.get(numberChar[0]);
            if (value == "����") {
                System.out.println(value + " " + currency[0]);
            } else if (value == "���" || value == "���" || value == "������") {
                System.out.println(value + " " + currency[1]);
            } else {
                System.out.println(value + " " + currency[2]);
            }
        } else if (numberChar.length == 1 && numberChar[0] == '0') {
            System.out.println("���� " + currency[2]);
        }

        if (numberChar.length == 2 && numberChar[1] == '0') {
            String value = desyatki.get(numberChar[0]);
            System.out.println(value + " " + currency[2]);
        } else if (numberChar.length == 2 && numberChar[0] != '1') {
            String digitOne = desyatki.get(numberChar[0]);
            String digitTwo = edinici.get(numberChar[1]);
            if (digitTwo == "����") {
                System.out.println(digitOne + " " + digitTwo + " " + currency[0]);
            } else if ((digitTwo == "���") || (digitTwo == "���") || (digitTwo == "������")) {
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




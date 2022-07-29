package TestSystem;

import java.util.Scanner;

public class TestStart {
    public static void main(String[] args) {
        LogicTest logicTest = new LogicTest();
        System.out.println("Вам нужно ответить на три вопроса.");
        CountForTest resultCount = new CountForTest();

        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер вопроса:");
            byte userChoose = scan.nextByte();
            switch (userChoose) {
                case (1):
                    logicTest.firstChooseOfQuestion(userChoose);
                    break;
                case (2):
                    logicTest.secondChooseOfQuestion(userChoose);
                    break;
                case (3):
                    logicTest.thirdChooseOfQuestion(userChoose);
                    break;
                default:
                    System.out.println("Неизвестная операция");
            }
        }
        resultCount.inputResultCount();
    }
}
package TestSystem2;

import java.util.Scanner;

public class TestStart {
    public static void main(String[] args) {
        LogicTest logicTest = new LogicTest();
        System.out.println("Вам нужно ответить на три вопроса: 1, 2, 3.");

        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите номер вопроса:");
            byte userChoose = scan.nextByte();
            switch (userChoose) {
                case (1):

                case (2):

                case (3):
                    logicTest.chooseYourQuestion(userChoose);
                    break;
                default:
                    System.out.println("Неизвестная операция");
            }
        }
        logicTest.resultToScreen();
    }
}
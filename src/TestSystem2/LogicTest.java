package TestSystem2;

import TestSystem.Questions;

import java.util.Scanner;

public class LogicTest {
    CountForTest countAnswers = new CountForTest();
    Scanner scan = new Scanner(System.in);

    public void chooseYourQuestion(byte userChoose) {
        QuestionsAndAnswersVar userChooseQuestion = new QuestionsAndAnswersVar(userChoose);
        System.out.println("Выберите вариант ответа:");
        Byte userAnswer = scan.nextByte();
        if((userChoose == 1 && userAnswer != 3)
                || (userChoose == 2 && userAnswer != 1)
                ||(userChoose == 3 & userAnswer != 3)) { System.out.println(countAnswers.getWrongAnswer());
                                                        } else {
                                                        System.out.println(countAnswers.getTrueAnswer());}
        System.out.println();
        }

        public void resultToScreen (){
        countAnswers.inputResultCount();
        }
    }

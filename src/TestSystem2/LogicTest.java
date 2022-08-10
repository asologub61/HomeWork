package TestSystem2;

import TestSystem.Questions;

import java.util.Scanner;

public class LogicTest {
    CountForTest countAnswers = new CountForTest();
    Scanner scan = new Scanner(System.in);
    QuestionsAndAnswersVar questionOne = new QuestionsAndAnswersVar("Сколько простых типов в Java?",
                                                                    "1) 4  \n2) 6  \n3) 8  \n4) 10");
    QuestionsAndAnswersVar questionTwo = new QuestionsAndAnswersVar("Какая команда компилирует файл в Java?",
                                                                    "1) javac  \n2) java  \n3) class  \n4) enum");
    QuestionsAndAnswersVar questionThree = new QuestionsAndAnswersVar("Какой цикл используется когда не известно количество итераций?",
                                                                      "1) for  \n2) for each  \n3) while  \n4) do while");

    public void chooseYourQuestion(byte userChoose) {
//        QuestionsAndAnswersVar userChooseQuestion = new QuestionsAndAnswersVar(userChoose);
        switch (userChoose){
            case(1):
                questionOne.screenInput();
                break;
            case(2):
                questionTwo.screenInput();
                break;
            case(3):
                questionThree.screenInput();
                break;
            default:
                System.out.println("Неизвестная операция");
        }
        System.out.println();

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

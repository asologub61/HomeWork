package TestSystem2;

import java.util.Scanner;

public class LogicTest {
    CountForTest countAnswers = new CountForTest();
    Scanner scan = new Scanner(System.in);

    public void ChooseYourQuestion(byte userChoose) {
        Questions userChooseQuestion = new Questions(userChoose);
        AnswersVar answerVar = new AnswersVar();
        System.out.println(answerVar.getVarForQuestion(userChoose));
        System.out.println("Выберите вариант ответа:");
        Byte userAnswer = scan.nextByte();
        if((userChoose == 1 && userAnswer != 3)
                || (userChoose == 2 && userAnswer != 1)
                ||(userChoose == 3 & userAnswer != 3)) { System.out.println(answerVar.getWrongAnswer());
                                                        countAnswers.setWrongAnswer(); } else {
                                                        System.out.println(answerVar.getTrueAnswer());
                                                        countAnswers.setWriteAnswer();}

        }
    }

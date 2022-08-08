package TestSystem;

import java.util.Scanner;

public class LogicTest {

    Scanner scan = new Scanner(System.in);

    public void firstChooseOfQuestion(byte userChoose) {
            byte numOfQuestion = userChoose;
            Questions userChooseQuestion = new Questions(numOfQuestion);
            AnswersVar answerVar = new AnswersVar();
            System.out.println(answerVar.getVarForQuestion(numOfQuestion));

            System.out.println("Выберите вариант ответа:");
            byte numOfAnswer = scan.nextByte();
            System.out.println(answerVar.getTrueAnswer(numOfAnswer));
            CountForTest countAnswers = new CountForTest();

            if(answerVar.getTrueAnswer(numOfAnswer) == "Правильно"){
                countAnswers.setWriteAnswer();} else {
                countAnswers.setWrongAnswer();}
            System.out.println();
            }

        public void secondChooseOfQuestion(byte userChoose) {
            byte numOfQuestion = userChoose;
            Questions userChooseQuestion = new Questions(numOfQuestion);
            AnswersVar answerVar = new AnswersVar();
            System.out.println(answerVar.getVarForQuestion(numOfQuestion));

            System.out.println("Выберите вариант ответа:");
            int numOfAnswer = scan.nextInt();
            System.out.println(answerVar.getTrueAnswer(numOfAnswer));

            CountForTest countAnswers = new CountForTest();
            if(answerVar.getTrueAnswer(numOfAnswer) == "Правильно"){
                countAnswers.setWriteAnswer();} else {
                countAnswers.setWrongAnswer();}
            System.out.println();
        }

        public void thirdChooseOfQuestion(byte userChoose){
            byte numOfQuestion = userChoose;
            Questions userChooseQuestion = new Questions(numOfQuestion);
            AnswersVar answerVar = new AnswersVar();
            System.out.println(answerVar.getVarForQuestion(numOfQuestion));
            System.out.println();

            System.out.println("Выберите вариант ответа:");
            short numOfAnswer = scan.nextShort();
            System.out.println(answerVar.getTrueAnswer(numOfAnswer));

            CountForTest countAnswers = new CountForTest();
            if(answerVar.getTrueAnswer(numOfAnswer) == "Правильно"){
                countAnswers.setWriteAnswer();} else {
                countAnswers.setWrongAnswer();}
            System.out.println();
    }
}

package TestSystem2;

public class QuestionsAndAnswersVar {

    private String question;
    private String answer;

    public QuestionsAndAnswersVar(String inputQuestion, String inputAnswer) {
        question = inputQuestion;
        answer = inputAnswer;

    }

    public void screenInput(){
        System.out.println(question);
        System.out.println(answer);

    }

//    private String questionOne= "Сколько простых типов в Java?";
//    private String questionTwo = "Какая команда компилирует файл в Java?";
//    private String questionThree = "Какой цикл используется когда не известно количество итераций?";
//    private  String varForQuestionOne = "1) 4  \n2) 6  \n3) 8  \n4) 10";
//    private String varForQuestionTwo = "1) javac  \n2) java  \n3) class  \n4) enum";
//    private String varForQuestionThree = "1) for  \n2) for each  \n3) while  \n4) do while";


//    public QuestionsAndAnswersVar(byte numOfQuestion) {
//        switch (numOfQuestion) {
//            case 1:
//                System.out.println(questionOne + "\n" + varForQuestionOne);
//                break;
//            case 2:
//                System.out.println(questionTwo + "\n" + varForQuestionTwo);
//                break;
//            case 3:
//                System.out.println(questionThree + "\n" + varForQuestionThree);
//                break;
//            default:
//                System.out.print("Неизвестная операция");
//                break;
//        }
    }




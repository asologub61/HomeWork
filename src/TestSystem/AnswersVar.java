package TestSystem;

public class AnswersVar {

    private  String varForQuestionOne = "1) 4  \n2) 6  \n3) 8  \n4) 10";
    private String varForQuestionTwo = "1) javac  \n2) java  \n3) class  \n4) enum";
    private String varForQuestionThree = "1) for  \n2) for each  \n3) while  \n4) do while";

    public String getVarForQuestion(int numForChoose){
        if(numForChoose == 1){
            return varForQuestionOne;
        }else if (numForChoose == 2){
            return varForQuestionTwo;
        }else  if (numForChoose == 3) {
            return varForQuestionThree;
        }
        return null;
    }

    public String getTrueAnswer(byte trueVar) {
        if (trueVar != 3) {
            return "Неправильно";
        } else {
            return "Правильно";
        }
    }
    public String getTrueAnswer(int trueVar) {
        if (trueVar != 1) {
            return "Неправильно";
        } else {
            return "Правильно";
        }
    }
    public String getTrueAnswer(short trueVar){
            if(trueVar != 3){
                return "Неправильно";
            } else {
                return "Правильно";
            }
    }
}



package TestSystem2;

public class CountForTest {
    private static int writeAnswer = 0;
    private static int wrongAnswer = 0;

    public void setWriteAnswer(){
        writeAnswer++;
    }

    public void setWrongAnswer(){
        wrongAnswer++;
    }

    public void inputResultCount(){
        System.out.println("Правильно: " + writeAnswer + " " + "Неправильно: " + wrongAnswer);
    }

}

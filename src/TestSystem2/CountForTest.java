package TestSystem2;

public class CountForTest {
    private static int writeAnswer = 0;
    private static int wrongAnswer = 0;

    public String getTrueAnswer(){
        writeAnswer++;
        return "Правильно";
    }

    public String getWrongAnswer() {
        wrongAnswer++;
        return "Неправильно";
    }

    public void inputResultCount(){
        System.out.println("Правильно: " + writeAnswer + " " + "Неправильно: " + wrongAnswer);
    }

}

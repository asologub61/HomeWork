package HomeworkTemplate;
import java.util.Scanner;


public class HomeworkTemplate {
    public static void main(String[] args) {
        
        int correctCount = 0, wrongCount = 0;
       
        String[] questions = {"Сколько простых типов в Java?", "Какая команда компилирует файл в Java?", "Какой цикл используется когда не известно количество итераций?"};
       
        String[][] answerOptions = {{"1) 4", "2) 6", "3) 8", "4) 10"}, {"1) javac", "2) java", "3) class", "4) enum"}, {"1) for", "2) for each", "3) while", "4) do while"}};

        int[] correctAnswers = {3, 1, 3};
 
        Scanner scanner = new Scanner(System.in);
       
        for (int i = 0; i < questions.length; i++) {
           
            System.out.println(questions[i]);

            for (int j = 0; j < 4; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.print("Ваш ответ: ");
            
            int answer = scanner.nextInt();
            
            if (answer == correctAnswers[i]) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;}

            System.out.println();
            }
        
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

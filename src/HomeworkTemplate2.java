import java.util.Scanner;


public class HomeworkTemplate2 {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[][] questionsWithAnswers = {{"Сколько простых типов в Java?" + "\n1) 4 " + "\n2) 6 " + "\n3) 8" + "\n4) 10",
                                            "Какая команда компилирует файл в Java?" + "\n1) javac" + "\n2) java"
                                             + "\n3) class" + "\n4) enum",
                                            "Какой цикл используется когда не известно количество итераций?" + "\n1) for" + "\n2) for each"
                                             + "\n3) while" + "\n4) do while"},
                                            {"3", "1", "3"}};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questionsWithAnswers.length; i++) {
            for (int j = 0; j < questionsWithAnswers.length+1; j++) {
                System.out.println(questionsWithAnswers[i][j]);

                System.out.print("Ваш ответ: ");
                //TODO: Считываем с консоли ответ пользователя
                String answer = scanner.nextLine();
                //TODO: Проверяем ответ и выводим результат
                if (answer.equals(questionsWithAnswers[1][j])){
                    System.out.println("Правильно");
                    correctCount++;
                } else {
                    System.out.println("Неправильно");
                    wrongCount++;
                }

                System.out.println();

            }

            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
            break;
        }
    }
}
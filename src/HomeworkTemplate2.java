import java.util.Scanner;


public class HomeworkTemplate2 {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        String[][] questionsWithAnswers = {{"Сколько простых типов в Java?" + "/n" + "1) 4 " + "/n" + "2) 6 " + "/n" +
                "3) 8" + "/n" + "4) 10",
                "Какая команда компилирует файл в Java?" + "/n" + "1) javac" + "/n" + "2) java"
                        + "/n" + "3) class" + "/n" + "4) enum",
                "Какой цикл используется когда не известно количество итераций?" + "/n" +
                        "1) for" + "/n" + "2) for each" + "/n" + "3) while" + "/n" + "4) do while"},
                {"3", "1", "3"}};


        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for (int i = 0; i < questionsWithAnswers.length; i++) {
            for (int j = 0; j < questionsWithAnswers.length; j++) {
                System.out.println(questionsWithAnswers[i][j]);

                System.out.print("Ваш ответ: ");
                //TODO: Считываем с консоли ответ пользователя
                String answer = scanner.nextLine();
                //TODO: Проверяем ответ и выводим результат
                if (answer == questionsWithAnswers[i][j]) {
                    System.out.println("Правильно");
                    correctCount++;
                } else {
                    System.out.println("Неправильно");
                    wrongCount++;
                }

                System.out.println();

            }

            // а также увеличиваем счетчики правильных и неправильных ответов

            //Выводим общий результат
            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
            break;
        }
    }
}
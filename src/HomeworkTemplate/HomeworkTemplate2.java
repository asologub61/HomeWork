package HomeworkTemplate;

import java.util.Scanner;


public class HomeworkTemplate2 {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        Object [][][] questionsWithAnswers = {{{"Сколько простых типов в Java?", "Какая команда компилирует файл в Java?",
                                               "Какой цикл используется когда не известно количество итераций?"},
                                               {"1) 4 " + "\n2) 6 " + "\n3) 8" + "\n4) 10", "1) javac" + "\n2) java"
                                               + "\n3) class" + "\n4) enum", "1) for" + "\n2) for each"
                                               + "\n3) while" + "\n4) do while"}},
                                               {{3, 1, 3}}};

        Scanner scanner = new Scanner(System.in);

                for (int k = 0; k < 3; k++) {
                    System.out.println(questionsWithAnswers[0][0][k]);
                    System.out.println(questionsWithAnswers[0][1][k]);

                System.out.print("Ваш ответ: ");

                int answer = scanner.nextInt();

                if (answer == (int) questionsWithAnswers[1][0][k]) {
                    System.out.println("Правильно");
                    correctCount++;
                } else {
                    System.out.println("Неправильно");
                    wrongCount++;
                }

                System.out.println();

            }

            System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);

                }
            }


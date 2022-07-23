package ru.otus.java.hw;
import java.util.Scanner;


public class HomeworkTemplate {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        // TODO: Массив вопросов (вместо null надо написать определение массива)
        String[] questions = {"Сколько простых типов в Java?", "Какая команда компилирует файл в Java?", "Какой цикл используется когда не известно количество итераций?"};

        // TODO: Массив вариантов ответов
        String[][] answerOptions = {{"1) 4", "2) 6", "3) 8", "4) 10"}, {"1) javac", "2) java", "3) class", "4) enum"}, {"1) for", "2) for each", "3) while", "4) do while"}};

        // TODO: Массив правильных ответов
        int[] correctAnswers = {3, 1, 3};

        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);
        // TODO: Цикл по всем вопросам - исправить, написать правильно
        for (int i = 0; i < questions.length; i++) {
            // TODO: Вывод вопроса на экран
            System.out.println(questions[i]);

            // TODO: Вывод вариантов ответов на экран
            for (int j = 0; j < 4; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.print("Ваш ответ: ");
            //TODO: Считываем с консоли ответ пользователя
            int answer = scanner.nextInt();
            //TODO: Проверяем ответ и выводим результат
            if (answer == correctAnswers[i]) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;}

            System.out.println();
            }

        // а также увеличиваем счетчики правильных и неправильных ответов




        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
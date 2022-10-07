package homework.otus.tests.stubs;

import homework.otus.game.GameWinnerPrinter;
import homework.otus.game.Player;

public class GameWinnerPrinterImplStub implements GameWinnerPrinter {

    @Override
    public void printWinner(Player winner) {
        if(winner.getName() == null) {
            System.err.println("Тест не прошел");
            throw new IllegalArgumentException("Имя игрока не может быть null");
        }else if (winner.getName().equals("Ничья")){
            System.err.println("Тест не прошел");
            throw new RuntimeException("Значения полученные при броске костей должны отличаться");
        }else if (winner.getName() == new String("Вася")){
            System.out.printf("Победитель: %s%n", winner.getName() + "\nВсе условия соблюдены, позитивный тест пройден");
        }

    }
}

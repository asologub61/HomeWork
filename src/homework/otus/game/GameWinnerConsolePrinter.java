package homework.otus.game;

public class GameWinnerConsolePrinter implements GameWinnerPrinter {
    @Override
    public void printWinner(Player winner) {
        System.out.printf("����������: %s%n", winner.getName());
    }
}

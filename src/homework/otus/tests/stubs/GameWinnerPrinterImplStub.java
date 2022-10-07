package homework.otus.tests.stubs;

import homework.otus.game.GameWinnerPrinter;
import homework.otus.game.Player;

public class GameWinnerPrinterImplStub implements GameWinnerPrinter {

    @Override
    public void printWinner(Player winner) {
        if(winner.getName() == null) {
            System.err.println("���� �� ������");
            throw new IllegalArgumentException("��� ������ �� ����� ���� null");
        }else if (winner.getName().equals("�����")){
            System.err.println("���� �� ������");
            throw new RuntimeException("�������� ���������� ��� ������ ������ ������ ����������");
        }else if (winner.getName() == new String("����")){
            System.out.printf("����������: %s%n", winner.getName() + "\n��� ������� ���������, ���������� ���� �������");
        }

    }
}

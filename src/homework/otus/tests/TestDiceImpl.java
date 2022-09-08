package homework.otus.tests;

import homework.otus.game.Dice;
import homework.otus.game.DiceImpl;

public class TestDiceImpl {
    public void testDiceImpl(){
        String scenario = "���� ��������� ���������� ��������";
        Dice dice = new DiceImpl();
        if ((dice.roll() > 0) && (dice.roll() <= 6)) {
            System.out.println(scenario + " �������");
        } else {
            System.err.println("���� �� ������");
            throw new IllegalArgumentException("�������� ������ ���� �� 1 �� 6");
        }
    }
}


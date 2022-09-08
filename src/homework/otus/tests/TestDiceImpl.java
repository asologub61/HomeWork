package homework.otus.tests;

import homework.otus.game.Dice;
import homework.otus.game.DiceImpl;

public class TestDiceImpl {
    public void testDiceImpl(){
        String scenario = "Тест получения рандомного значения";
        Dice dice = new DiceImpl();
        if ((dice.roll() > 0) && (dice.roll() <= 6)) {
            System.out.println(scenario + " пройден");
        } else {
            System.err.println("Тест не прошел");
            throw new IllegalArgumentException("Значение должно быть от 1 до 6");
        }
    }
}


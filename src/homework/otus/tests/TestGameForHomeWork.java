package homework.otus.tests;

import homework.otus.game.Dice;
import homework.otus.game.Game;
import homework.otus.game.GameWinnerPrinter;
import homework.otus.tests.stubs.DiceImplStubForTestGame1;
import homework.otus.tests.stubs.DiceImplStubForTestGame2and3;
import homework.otus.tests.stubs.GameWinnerPrinterImplStub;
import homework.otus.tests.stubs.PlayerStub;


public class TestGameForHomeWork {

    Dice diceImplStubForTestGame1 = new DiceImplStubForTestGame1();
    Dice diceImplStubForTestGame2 = new DiceImplStubForTestGame2and3();
    GameWinnerPrinter gameWinnerPrinterStub = new GameWinnerPrinterImplStub();
    Game forTestGame1 = new Game(diceImplStubForTestGame1, gameWinnerPrinterStub);
    Game forTestGame2and3 = new Game(diceImplStubForTestGame2, gameWinnerPrinterStub);


    public void testGame1() {
        forTestGame1.playGame(new PlayerStub("Вася"), new PlayerStub("Ничья"));
    }
    public void testGame2() {

        forTestGame2and3.playGame(new PlayerStub(null), new PlayerStub("Игорь"));
    }
    public void testGame3(){
        forTestGame2and3.playGame(new PlayerStub("Вася"), new PlayerStub("Игорь"));
    }
}
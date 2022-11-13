package homework.otus.tests.stubs;

import homework.otus.game.Dice;

public class DiceImplStubForTestGame2and3 implements Dice {

    boolean firstRollCall = true;
    @Override
    public int roll() {
        if(firstRollCall) {
            firstRollCall = false;
            return 6;
        }else{
            return 2;
        }
    }
}

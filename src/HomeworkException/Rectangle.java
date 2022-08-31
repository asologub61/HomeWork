package HomeworkException;

import java.util.Scanner;

public class Rectangle {
    private int squareRectangle;

    public Rectangle() {
    }
    public Rectangle(int a, int b) {

        squareRectangle = a * b;
    }
    public int getSquare() {
        return this.squareRectangle;
    }
}

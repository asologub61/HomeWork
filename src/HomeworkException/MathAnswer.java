package HomeworkException;

import java.util.Scanner;

public class MathAnswer {


    public static void main(String[] args) {
        Scanner squareSideUserIn = new Scanner(System.in);
        SquareShapes shapeSquare = new SquareShapes();

        shapeSquare.findSquareSquare();

        try {
            shapeSquare.findSquareRectangle();
        } catch (Exception e) {}

        shapeSquare.findSquareTriangle();

    }
}




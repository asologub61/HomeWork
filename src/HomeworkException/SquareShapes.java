package HomeworkException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SquareShapes {
    Scanner squareSideUserIn = new Scanner(System.in);
    public void findSquareSquare(){

        System.out.println("Чтобы вычислить площадь квадрата, введите размер его стороны:");
        try {
            int userInputSide = squareSideUserIn.nextInt();
            Square square = new Square(userInputSide);
            System.out.println("Площадь квадрата = " + square.getSquare());
            } catch (Exception e) {
            System.err.println("В процессе выполнения произошла ошибка.");
        }
    }
    public void findSquareRectangle() throws Exception {
        System.out.println("Чтобы вычислить площадь прямоугольника, введите размеры его сторон:");
        int userInputSideA = squareSideUserIn.nextInt();
        int userInputSideB = squareSideUserIn.nextInt();
        Rectangle rectangle = new Rectangle(userInputSideA, userInputSideB);
        System.out.println("Площадь прямоугольника = " + rectangle.getSquare());
        throw new Exception();
    }
    public void findSquareTriangle() {
        TrianglePlug trianglePlug = new TrianglePlug();
        try(InputStream stream = trianglePlug.exception()) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



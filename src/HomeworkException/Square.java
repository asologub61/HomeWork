package HomeworkException;

public class Square {

    private  int square;

    public Square(){ }

    public Square (int num){
       int side = num;
       square = side*side;
    }

    public int getSquare(){
        return this.square;
    }

}

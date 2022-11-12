package FinalProjectWork;

import java.util.Scanner;

public class Project {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите число:");
        int number = scanner.nextInt();
        CastMoney starter = new CastMoney();
        starter.doCastMoney(number);
    }
}

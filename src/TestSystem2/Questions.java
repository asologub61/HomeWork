package TestSystem2;

public class Questions {
    private String questionOne = "Сколько простых типов в Java?";
    private String questionTwo = "Какая команда компилирует файл в Java?";
    private String questionThree = "Какой цикл используется когда не известно количество итераций?";

    public Questions(byte numOfQuestion) {
        switch (numOfQuestion) {
            case 1:
                System.out.println(questionOne);
                break;
            case 2:
                System.out.println(questionTwo);
                break;
            case 3:
                System.out.println(questionThree);
                break;
            default:
                System.out.print("Неизвестная операция");
                break;
        }
    }
}



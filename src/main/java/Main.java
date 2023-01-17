import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber=40;
        int secondNumber=55;

        int number1=205;
        int number2=200;

        int number3=40;

        RelationalOperators relationalOperators = new RelationalOperators();
        relationalOperators.minimumOfTwoNumber(firstNumber, secondNumber);
        relationalOperators.minimumAndEqualToTwoNumber(firstNumber, secondNumber);

        relationalOperators.maximumOfTwoNumber(number1, number2);
        relationalOperators.maximumAndEqualToTwoNumber(number1, number2);

        relationalOperators.notEqualToTwoNumber(number1, number3);

    }
}







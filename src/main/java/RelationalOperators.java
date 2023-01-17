public class RelationalOperators {

        public int minimumOfTwoNumber(int firstNumber, int secondNumber) {
                if (firstNumber < secondNumber) {
                        System.out.println(firstNumber + " is Minimum");
                }
                return firstNumber;
        }

        public int minimumAndEqualToTwoNumber(int firstNumber, int secondNumber) {
                if (firstNumber <= secondNumber) {
                        System.out.println(firstNumber + " is Minimum or Equal");
                }
                return firstNumber;
        }

        public int maximumOfTwoNumber(int number1, int number2) {
                if (number1 > number2) {
                        System.out.println(number1 + " is Maximum");
                }
                return number1;
        }


        public int maximumAndEqualToTwoNumber(int number1, int number2) {
                if(number1 >= number2) {
                        System.out.println(number1 + " is Maximum or Equal");
                }
                return number1;
        }


        public int notEqualToTwoNumber(int number1, int number3) {
                if(number1 != number3) {
                        System.out.println(number1 + " Both Are Not Equal");
                }
                return number1;
        }
}







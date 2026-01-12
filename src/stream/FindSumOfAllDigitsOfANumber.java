package stream;

public class FindSumOfAllDigitsOfANumber {
    public static void main(String[] args) {
        int number = 123456;
        int sum = String.valueOf(number)  // converts integer to string
                .chars()                   // converts string to IntStream
                .map(Character::getNumericValue) // converts each characters to integer
                .sum();
        /**
         * alternate of .map(Character::getNumericValue) is
         * .map(c -> c-'0')
         */
        System.out.println("sum of number is " + sum);
    }
}

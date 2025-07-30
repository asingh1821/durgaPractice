package stream;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CheckPrimeNumberInAList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(44,66, 102, 333, 211);
        boolean primeNum = list.stream()
                .anyMatch(CheckPrimeNumberInAList::isPrime);
        System.out.println("list contains prime number is: "+ primeNum);
    }

    public static boolean isPrime(int number){
        if(number < 1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

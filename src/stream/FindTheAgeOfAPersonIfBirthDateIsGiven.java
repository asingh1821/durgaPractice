package stream;

import java.time.LocalDate;
import java.time.Period;

public class FindTheAgeOfAPersonIfBirthDateIsGiven {

    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1997,04,05);//defining birthday
        LocalDate today = LocalDate.now();  //defining today's data
        Period period = Period.between(birthDay,today); //calculating total period
        int age = period.getYears(); // calculating age
        System.out.println("total age is "+ age + " years");

    }
}

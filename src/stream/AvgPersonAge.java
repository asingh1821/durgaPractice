package stream;

import hashCodeAndEqualsContract.example1.Person;

import java.util.Arrays;
import java.util.List;

public class AvgPersonAge {
    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person(20,"amit"),
                new Person(25,"Vibhu"),
                new Person(27,"Ankit"));
                double avgAge = personList.stream()
                .mapToInt(Person::getAge)
                .average().orElse(0);
        System.out.println("Average Person age is : "+ avgAge);
    }
}

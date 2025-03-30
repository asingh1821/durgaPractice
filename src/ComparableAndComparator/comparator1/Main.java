package ComparableAndComparator.comparator1;

import ComparableAndComparator.comparator1.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> car = new ArrayList<>();
        car.add(new Car("Suzuki", "diesel"));
        car.add(new Car("Maruti", "cng"));
        car.add(new Car("Hundai", "electric"));
        car.add(new Car("Honda","petrol"));

        Collections.sort(car,(car1, car2)-> car1.carName.compareTo(car2.carName));
        car.forEach((cars)-> System.out.println("carName : "+cars.carName));
    }
}

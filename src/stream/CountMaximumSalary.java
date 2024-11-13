package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMaximumSalary {
    public static void main(String[] args) {
//        ArrayList<Integer> salary = new ArrayList<>();
//        salary.add(5000);
//        salary.add(1000);
//        salary.add(3000);
//        salary.add(2000);
//        salary.add(8000);
//        salary.add(4000);

        List<Integer> salary = Arrays.asList(1000, 2000, 3000, 4000, 5000, 6000, 7000);
        long countOfMaxSalary = salary.stream()
                .filter(s -> s > 3000)
                .count();
        System.out.println(countOfMaxSalary);
    }
}


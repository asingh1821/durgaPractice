package hashMapPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Amit",25);
        Employee e2 = new Employee("Aman", 24);
        Employee e3 = new Employee("Ankit", 26);
        Employee e4 = new Employee("Vibhu", 28);

        Map<Employee,Integer> hm = new HashMap<>();
        hm.put(e1,1000);
        hm.put(e2,2000);
        hm.put(e3,3000);
        hm.put(e4,4000);
        System.out.println(hm);
    }
}

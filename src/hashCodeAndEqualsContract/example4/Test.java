package hashCodeAndEqualsContract.example4;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Amit");
        Employee e2 = new Employee(2,"Saurav");
        Employee e3 = new Employee(3, "Loli");
        Employee e4 = new Employee(4,"Sonma");
        Employee e5 = new Employee(1, "Amit");
        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Iterator<Employee> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }

    }
}

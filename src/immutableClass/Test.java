package immutableClass;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        User u = new User(1, Arrays.asList("HR","Dev","Manager"));
        u.getRoles().forEach(System.out::println);
    }
}

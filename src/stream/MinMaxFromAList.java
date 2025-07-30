package stream;

import java.util.ArrayList;

public class MinMaxFromAList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(253);
        list.add(223);
        list.add(123);
        list.add(230);
        list.add(76);
        System.out.println(list);
        Integer min = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println("min ="+min );
        Integer max = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        System.out.println("max "+max);

//        Integer min2 = list.stream().min((i1,i2) -> i2.compareTo(i1)).get();
//        System.out.println("min ="+min2 );
//        Integer max2 = list.stream().max((i1,i2) -> i2.compareTo(i1)).get();
//        System.out.println("max "+max2);

    }
}

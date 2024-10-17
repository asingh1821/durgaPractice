package stream;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringUsingComparator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("AAAAAA");
        list.add("A");
        list.add("AA");
        list.add("AAAAA");
        list.add("AAAA");
        System.out.println(list);
        Comparator<String> c = (s1, s2) ->{
                               int l1 = s1.length();
                               int l2 = s2.length();
                               if (l1 > l2) return 1;
                               else if (l1 < l2) return -1;
                               else return s1.compareTo(s2);
        };
        List<String> sortedName = list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sortedName);

    }
}

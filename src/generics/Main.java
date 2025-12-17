package generics;

public class Main {

    public static void main(String[] args) {
        Print<Integer> p = new Print<Integer>();
        p.setPrint(5);
        Integer val = p.getPrint();
        System.out.println(val);
    }
}

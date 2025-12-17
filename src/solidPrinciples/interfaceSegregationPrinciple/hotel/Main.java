package solidPrinciples.interfaceSegregationPrinciple.hotel;

public class Main {
    public static void main(String[] args) {
        Chef c = new Chef();
        c.cook();
        Waiter w = new Waiter();
        w.serveFood();
        Washerman wsh = new Washerman();
        wsh.washing();
    }
}

package solidPrinciples.interfaceSegregationPrinciple.documents;

public class Main {
    public static void main(String[] args) {
        SimplePrinter s = new SimplePrinter();
        s.printDoc();
        MultifunctionalPrinter m = new MultifunctionalPrinter();
        m.facDoc();
        m.scanDoc();
        m.printDoc();
    }
}

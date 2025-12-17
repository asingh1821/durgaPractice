package solidPrinciples.interfaceSegregationPrinciple.documents;

public class SimplePrinter implements Printer{
    @Override
    public void printDoc() {
        System.out.println("Simple printer will print the doc");
    }
}

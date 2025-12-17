package solidPrinciples.interfaceSegregationPrinciple.documents;

public class MultifunctionalPrinter implements Fax,Scanner,Printer{
    @Override
    public void facDoc() {
        System.out.println("MultifunctionalPrinter can fax");
    }

    @Override
    public void printDoc() {
        System.out.println("MultifunctionalPrinter can print documents");
    }

    @Override
    public void scanDoc() {
        System.out.println("MultifunctionalPrinter can scan documents");
    }
}

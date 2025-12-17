package solidPrinciples.LiskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5,10);
        Shape s2 = new Square(10);

        double d1 = s1.getArea();
        double d2 = s2.getArea();

        System.out.println("Area of Rectangle is:  "+ d1);
        System.out.println("Area of Square is:  "+ d2);
    }
}

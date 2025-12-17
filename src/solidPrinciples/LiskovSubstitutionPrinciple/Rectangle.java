package solidPrinciples.LiskovSubstitutionPrinciple;

public class Rectangle implements Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length * width;
    }
}

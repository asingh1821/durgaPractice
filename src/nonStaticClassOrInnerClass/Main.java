package nonStaticClassOrInnerClass;

public class Main {

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        OuterClass.InnerClass innerObj = obj.new InnerClass();
        innerObj.print();
    }
}

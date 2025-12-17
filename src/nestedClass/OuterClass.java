package nestedClass;

public class OuterClass {
    int instanceVariable = 10;
    static int classVariable = 20;

    static class NestedClass{
        public static void print(){
            System.out.print(classVariable);
        }
    }
}

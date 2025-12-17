package nonStaticClassOrInnerClass;

public class OuterClass {
    int instanceVariable = 15;
    static int classVariable = 20;

    class InnerClass{
        public  void print(){
            System.out.println(instanceVariable + classVariable);
        }
    }

}

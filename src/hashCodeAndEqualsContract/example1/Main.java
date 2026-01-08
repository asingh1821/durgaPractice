package hashCodeAndEqualsContract.example1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(25,"Amit");
        Person p2 = new Person(25,"Amit");

        if(p1.hashCode() == p2.hashCode()){
            if(p1.equals(p2)){
                System.out.println("both objects are equal");
            }else{
                System.out.println("both objects are not equal");
            }
        }else{
            System.out.println("both objects are not equal");
        }

    }
}

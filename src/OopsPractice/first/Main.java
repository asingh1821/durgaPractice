package OopsPractice;

public class Main {

    public static void main(String[] args) {
        OopsPractice.ElectronicProduct ep = new OopsPractice.ElectronicProduct(100,"Washing Machine", 1000);
        ep.finalPrice(20);
        System.out.println("product id : "+ ep.getProductId());
        System.out.println("product name is : "+ ep.getProductName());
        System.out.println(("product price : "+ ep.getProductPrice()));
        System.out.println("product price after discount : "+ ep.finalPrice(20));


        System.out.println("----------------------------------");
        OopsPractice.WashingMachine wm = new OopsPractice.WashingMachine(101, "top load", 50000, 120);
        wm.extendWarranty(30);
        System.out.println("product id : "+ wm.getProductId());
        System.out.println("product name : " + wm.getProductName());
        System.out.println("total  warrenty : "+ wm.getWarrantyPeriod());
        System.out.println("total Extended warranty : "+ wm.extendWarranty(10));
        System.out.println("product id : "+ ep.getProductName());
    }
}

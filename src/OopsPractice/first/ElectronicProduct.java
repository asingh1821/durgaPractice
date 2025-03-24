package OopsPractice;

public class ElectronicProduct {
    private int productId;
    private String productName;
    private double productPrice;

    ElectronicProduct(int productId, String productName, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public String getProductName(){
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public double finalPrice(double discount){
       double  price = productPrice - (productPrice * discount)/100;
       return price;
    }
}

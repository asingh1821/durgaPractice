package OopsPractice;

class WashingMachine extends OopsPractice.ElectronicProduct {

    private int warrantyPeriod;

    public WashingMachine(int productId, String productName, int productPrice,int warrantyPeriod){
        super(productId,productName,productPrice);
        this.warrantyPeriod = warrantyPeriod;
    }
    public int  extendWarranty(int additionalPeriod){
        warrantyPeriod += additionalPeriod;
        return warrantyPeriod;
    }
    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
//    @Override
//    public double finalPrice(double discount){
//        //super.finalPrice(discount);
//        System.out.println("final price after discount is : "+ getProductName());
//    }
}

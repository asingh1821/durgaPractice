package solidPrinciples.singleResponsibilityPrinciple;

public class Invoice {

    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal() {
        int price = ((marker.price)* quantity);
        return price;
    }
}

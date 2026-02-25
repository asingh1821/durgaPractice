package hotelService;
import java.util.*;
import java.util.stream.Collectors;

public class Hotel {
    private String name;
    private String  address;
    private double price;
    List<String> days;

    public Hotel(String name, String address,double price, List<String> days) {
        this.name = name;
        this.address = address;
        this.price = price;
        this.days = new ArrayList<>();
    }
    public Hotel(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public List<Hotel> sortHotelByPrice(List<Hotel> listOfHotel) {
        return listOfHotel.stream()
                .sorted(Comparator.comparingDouble(Hotel::getPrice))
                .collect(Collectors.toList());
    }
//    public List<Hotel> pricePerHotel(){
//        List<Hotel> priceHotel = new ArrayList<>();
//        lis
//    }


    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", days=" + days +
                '}';
    }
}

package hotelService;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("CityInn", "London",120.0,
                Arrays.asList("MONDAY","TUESDAY","WEDNESDAY"));
        Hotel h2 = new Hotel("SeaView", "Brighton",150.0,
                Arrays.asList("TUESDAY","WEDNESDAY"));
        Hotel h3 = new Hotel("LakePoint", "London",130.0,
                Arrays.asList("WEDNESDAY"));
        List<Hotel> listOfHotel = Arrays.asList(h1,h2,h3);
        Hotel h = new Hotel();
        List<Hotel> sortedHotelList =  h.sortHotelByPrice(listOfHotel);
        System.out.println(sortedHotelList);

    }
}

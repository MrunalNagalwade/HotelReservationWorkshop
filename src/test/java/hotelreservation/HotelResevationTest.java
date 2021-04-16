package hotelreservation;

import org.junit.jupiter.api.Test;

public class HotelResevationTest {
    @Test
public void addHotelTo() {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 110);
        hotelReservation.addHotel("Bridgewood", 160);
        hotelReservation.addHotel("Ridgewood", 220);

        Hotel cheapestHotel = hotelReservation.getCheapestHotel("20-06-2020", "22-06-2020");
        System.out.println("Cheapest hotel : " + cheapestHotel);
    }
}

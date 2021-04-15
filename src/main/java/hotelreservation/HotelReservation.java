package hotelreservation;

import java.util.ArrayList;

public class HotelReservation {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    public HotelReservation()
    {
        this.hotelList = new ArrayList<>();
    }
    public void addHotel(String hotelName, double rates)
    {
        Hotel hotel = new Hotel(hotelName,rates);
        hotelList.add(hotel);
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to Hotel Reservation Program");
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 110);
        hotelReservation.addHotel("Bridgewood", 160);
        hotelReservation.addHotel("Ridgewood", 220);
    }
}

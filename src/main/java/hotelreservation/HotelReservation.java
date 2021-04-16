package hotelreservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

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
    public Hotel getCheapestHotel(String startDate, String endDate)
    {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date fromDate = dateFormat.parse(startDate);
            Date toDate = dateFormat.parse(endDate);
            int numOfDays = (int) (((toDate.getTime() - fromDate.getTime())/ (86.4e6)) + 1);
            System.out.println("Number of days: " + numOfDays);
            return hotelList.stream()
                    .sorted(Comparator.comparingInt(hotel -> hotel.calculatingTotalPrice(numOfDays)))
                    .findFirst().orElse(null);
        }catch (NullPointerException | ParseException e) {
            System.out.println("Exception occured: " + e );
        }
        return null;
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

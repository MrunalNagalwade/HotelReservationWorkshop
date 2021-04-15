package hotelreservation;

public class Hotel {
    String hotelName;
    double rates;

    public Hotel(String hotelName,double rates)
    {
        this.hotelName=hotelName;
        this.rates=rates;
    }
    public String getHotelName()
    {
        return hotelName;
    }
    public void setHotelName(String hotelName)
    {
        this.hotelName = hotelName;
    }
    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }
}

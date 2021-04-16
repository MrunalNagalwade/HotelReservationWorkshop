package hotelreservation;

public class Hotel {
    String hotelName;
    double rates;
    int rate;
    int totalPrice;
    int weekDay;
    int weekEnd;

    public Hotel(String hotelName,double rates,int weekDay,int weekEnd)
    {
        this.hotelName=hotelName;
        this.rates=rates;
        this.weekDay=weekDay;
        this.weekEnd=weekEnd;
    }

    public Hotel(String hotelName, int weekDay, int weekEnd) {

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
    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public int getWeekEnd() {
        return weekEnd;
    }

    public void setWeekEnd(int weekEnd) {
        this.weekEnd = weekEnd;
    }

    public int calculatingTotalPrice(int numOfDays) {
        this.totalPrice = numOfDays * rate;
        return totalPrice;
    }
    @Override
    public String toString() {
        String str = "Hotel name : " + this.hotelName + " rates for regular customer : " + this.rates + " , "+totalPrice ;
        return str;
    }
}

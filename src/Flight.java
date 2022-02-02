public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private static int bookedSeats;

    public String getFlightDetails() {
        return flightNumber;
    }

    public boolean checkAvailiability(){
        if (capacity - bookedSeats <= 0)
        {
            return false;
        }
        return true;
    }


}

public class Flight {
    private String flightNumber;
    private String airline;
    private int capacity;
    private static int bookedSeats;


    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    static {
        bookedSeats = 0;
    }

    public Flight() {
        this(
                "flightNumber",
                "airline",
                0,
                0);
    }

    public Flight(
            String flightNumber,
            String airline,
            int capacity,
            int bookedSeats) {
        this.bookedSeats = ++bookedSeats;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
    }

    public Flight(Flight flight) {
        this.bookedSeats = flight.bookedSeats;
        this.flightNumber = flight.flightNumber;
        this.airline = flight.airline;
        this.capacity = flight.capacity;
    }

    public String getFlightDetails() {
        return flightNumber;
    }

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

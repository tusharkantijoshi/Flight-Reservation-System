public class Ticket {
    public String pnr;
    private String from;
    private String to;
    private Flight flight;
    private String departureDateTime;
    private String arrivalDataTime;
    private Passenger passenger;
    private String seatNo;
    private float price;
    private static boolean cancelled;

    public String checkStatus(){
        return pnr;
    }

    public int getFlightDuration(){
        return xyz;
    }

    public void Cancelled(){

    }
}

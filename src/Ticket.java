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
    public Ticket(
            String pnr,
            String from,
            String to,
            String departureDateTime,
            String arrivalDataTime,
            String seatNo,
            float price,
            boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDataTime = arrivalDataTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }
    public String checkStatus(){
        return pnr;
    }

    public int getFlightDuration(){
        return xyz;
    }

    public void Cancelled(){

    }
}

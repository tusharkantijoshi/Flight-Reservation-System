public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight(
                "1234",
                "Indigo",
                200,
                125);

        Ticket ticket = new Ticket(
                "pnr",
                "Bengaluru",
                "Karnataka",
                "2nd Feb, 1400 hrs",
                "2nd Feb, 1700 hrs",
                "13B",
                8000,
                false);

        TouristTicket touristTicket = new TouristTicket(
                "pnr",
                "Bengaluru",
                "Karnataka",
                "2nd Feb, 1400 hrs",
                "2nd Feb, 1700 hrs",
                "13B",
                8000,
                false,
                "Karnataka",
                Karnataka);

        RegularTicket regularTicket = new RegularTicket(
                "pnr",
                "Bengaluru",
                "Karnataka",
                "2nd Feb, 1400 hrs",
                "2nd Feb, 1700 hrs",
                "13B",
                8000,
                false, "food");


        System.out.println(flight.checkStatus(ticket));

    }
}

public class TouristTicket {
    private String hotelAddress;
    private String[] selectedTouristLocation;
    public TouristTicket(
            String pnr,
            String from,
            String to,
            String departureDateTime,
            String arrivalDataTime,
            String seatNo,
            float price,
            boolean cancelled,
            String hotelAddress,
            String[] selectedTouristLocation) {
        super(
                pnr,
                from,
                to,
                departureDateTime,
                arrivalDataTime,
                seatNo,
                price,
                cancelled
        );
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String[] removeTouristLocation(String location) {
        return selectedTouristLocation;
    }

    public String[] addTouristLocation(String location) {
        return selectedTouristLocation;
    }

    public String[] getTouristLocation() {
        return selectedTouristLocation;
    }
}

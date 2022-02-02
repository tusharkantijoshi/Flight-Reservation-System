public class RegularTicket {
    private String specialService;

    public RegularTicket(
            String pnr,
            String from,
            String to,
            String departureDateTime,
            String arrivalDataTime,
            String seatNo,
            float price,
            boolean cancelled,
            String specialService) {
        super(pnr,
                from,
                to,
                departureDateTime,
                arrivalDataTime,
                seatNo,
                price,
                cancelled);
        this.specialService = specialService;
    }

    public void updateSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public String getSpecialService() {
        return specialService;
    }
}

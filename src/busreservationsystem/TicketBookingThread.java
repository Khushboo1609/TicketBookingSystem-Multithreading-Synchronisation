package busreservationsystem;

public class TicketBookingThread  extends Thread{
    private TicketCounter ticketCounter;
    private String passengerName;
    private int noofSeatsToBook;
    public TicketBookingThread(TicketCounter ticketCounter,String passengerName,int noofSeatsToBook)
    {
        this.ticketCounter=ticketCounter;
        this.passengerName=passengerName;
        this.noofSeatsToBook=noofSeatsToBook;
    }
    public void run()
    {
        ticketCounter.bookTicket(passengerName,noofSeatsToBook) ;
    }


}

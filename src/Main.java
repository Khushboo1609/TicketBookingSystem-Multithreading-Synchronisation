import busreservationsystem.TicketBookingThread;
import busreservationsystem.TicketCounter;

public class Main {
    public static void main(String[] args) {
        TicketCounter tc=new TicketCounter();

        TicketBookingThread t1=new TicketBookingThread(tc,"khushboo",2);
        TicketBookingThread t2=new TicketBookingThread(tc,"Muskan",2);
        t1.start();
        t2.start();
    }
}
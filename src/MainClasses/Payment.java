package MainClasses;

import java.util.Date;

public class Payment {
    private static String movieName;
    private static int ticketPrice;
    private static Date paymentDate;

    
    
    public Payment(int ticketPrice,Date paymentDate,String movieName){
        this.ticketPrice = ticketPrice;
        this.paymentDate = paymentDate;
        this.movieName = movieName;
    }
    public static Date getPaymentDate() {return paymentDate;}
    public static int getQuantity() {return ticketPrice;}
    public static String getMovieName() {return movieName;}
    
    
    
}

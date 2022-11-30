import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Good evening " + name + ", Mr. Wayne will be with you presently.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "Today is " + date;
    }
    
    public String respondBeforeAlexis(String conversation1) {
        return conversation1;
    }
    
    
}


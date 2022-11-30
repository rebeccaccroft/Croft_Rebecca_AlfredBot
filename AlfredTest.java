public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        
        String alexisTest = alfredBot.respondBeforeAlexis(
            "I'm sure you have everything under control, sir."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "Master Wayne, if you would refrain from setting the west wing on fire this afternoon, I would most appreciate it.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "I was not aware you knew where the laundry was sir."
        );
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
        
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);
    }
}

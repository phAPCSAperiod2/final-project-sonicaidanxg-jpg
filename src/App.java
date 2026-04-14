public class App {
    public static void main(String[] args) throws Exception {
        // Create a Quote object to manage quotes
        Quote quoteManager = new Quote("First quote", "Author One");

        // Add more quotes
        quoteManager.addQuote("Second quote", "Author Two");
        quoteManager.addQuote("Third quote");

        // Print the quote list
        System.out.println("Quote List:");
        for (Object quote : quoteManager.returnQuoteList()) {
            System.out.println((String) quote);
        }

        // Print a random quote
        System.out.println("\nRandom Quote:");
        System.out.println(quoteManager.returnRandQuote());

        // Remove the second quote (index 2, since indices start at 1)
        quoteManager.removeQuote(2);

        // Print the list again
        System.out.println("\nQuote List after removal:");
        for (Object quote : quoteManager.returnQuoteList()) {
            System.out.println((String) quote);
        }
    }
}

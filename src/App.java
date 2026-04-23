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

        // Test with empty list
        Image imgManager = new Image(
                "https://ohiodnr.gov/wps/wcm/connect/gov/4e9331d0-5d92-47dd-9ce2-04a2c62ea619/whitetaileddeer3.jpg?MOD=AJPERES&CACHEID=ROOTWORKSPACE.Z18_JQGCH4S04P41206HNUKVF31000-4e9331d0-5d92-47dd-9ce2-04a2c62ea619-pIvo2PS",
                "Image1");
        imgManager.displayRandImage(); // Should print "No images to display."

        // Add images
        imgManager.addImage(new Image(
                "https://ohiodnr.gov/wps/wcm/connect/gov/4e9331d0-5d92-47dd-9ce2-04a2c62ea619/whitetaileddeer3.jpg?MOD=AJPERES&CACHEID=ROOTWORKSPACE.Z18_JQGCH4S04P41206HNUKVF31000-4e9331d0-5d92-47dd-9ce2-04a2c62ea619-pIvo2PS",
                "Image1"));
        imgManager.addImage(new Image(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQoS9T4c7jtJHvR749fPCCA1Uny4-3R2486w&s",
                "Image2"));

        // Display random image
        imgManager.displayRandImage();

        // Remove an image and display again
        imgManager.removeImage(1);
        imgManager.displayRandImage();

    }
}

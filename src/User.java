import java.util.Scanner;

public class User {

//Do this in App.java.

    // public void initializeLists() {

    //     System.out.println("Initializing lists...");

    //     Quote q = new Quote("First quote", "Author One");
    //     q.addQuote("Second quote", "Author Two");
    //     q.addQuote("Third quote");

    //     Image i = new Image("https://cdn12.picryl.com/photo/2016/12/31/deer-whitetail-fawn-animals-087653-1024.jpg",
    //             "Image1");
    //     i.addImage(i);
    //     Image b = new Image(
    //             "https://pixnio.com/free-images/fauna-animals/deers/young-red-deer-fawn-odocoileus-virginianus.jpg",
    //             "Image2");
    //     i.addImage(b);
    //     Image c = new Image(
    //             "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRg7mqOU8dEnsBAUEoHPwHRv3ITz0uOGnC5Vw&s", "Image3");
    //     i.addImage(c);

    //     System.out.println("Lists initialized.");

    // }

    public void loop(Quote q, Image i){
        boolean run = true;
        String input = null;
        Scanner scanner = new Scanner(System.in);


        while (run) {
            System.out.println("Welcome to the Motivation Center! \n What would you like to do?");
            //Print Menu
            /*1. Get a random Quote
              2. Get a random Image.
              3. View the QuoteList.
              4. View the ImageList.
              5. Add a quote.
              6. Add an image.
              7. Remove a quote.
              8. Remove an image.
              9. Quit */

            input = scanner.nextLine();
            if (input.equals("1")){
                System.out.println(q.returnRandQuote());
            }
            else if (input.equals("2")){
                i.displayRandImage();
            }
            else if (input.equals("3")){
                System.out.println(q.returnQuoteList());
            }
            else if (input.equals("4")){
                i.displayIDs();
            }
            else if (input.equals("5")){
                addingQuote(q);
            }
            else if (input.equals("6")){
                addingImage(i);
            }
            else if (input.equals("7")){
                removingQuote(q);
            }
            else if (input.equals("8")){
                removingImage(i);
            }
            else if (input.equals("9")){
                run = false;
            }
        }
    }

    /*
    Adds a quote to the quotelist with user input.


    @param Quote the Quote object to access the quote list.
    @author Aidan Manzanares
    */

    public void addingQuote(Quote q){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the text of the quote?");
            String text = scanner.nextLine();
            System.out.println("Does the quote have an author? (Y/N)");
            String yn = scanner.nextLine();
            if (yn.equalsIgnoreCase("y")){
                System.out.println("Please enter the author of the quote.");
                String author = scanner.nextLine();
                q.addQuote(text, author);
            }
            if (yn.equalsIgnoreCase("n")){
                q.addQuote(text);
            }

        }

        public void removingQuote(Quote q){
            Scanner scanner = new Scanner(System.in);
            System.out.println(q.returnQuoteList());
            System.out.println("Enter the index of the quote you'd like to remove. (Starting at 1 for the 1st quote.)");
            int index = scanner.nextInt();
            q.removeQuote(index);

        }

        public void addingImage(Image i){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the link of the image?");
            String link = scanner.nextLine();
            System.out.println("What would you like to name the image?");
            String name = scanner.nextLine();

            Image im = new Image(link, name);
            i.addImage(im);


        }

        public void removingImage(Image i){
            Scanner scanner = new Scanner(System.in);
            System.out.println(i.returnImageList());
            System.out.println("Enter the index of the image you'd like to remove. (Starting at 1 for the 1st image.)");
            int index = scanner.nextInt();
            i.removeImage(index);

        }


    }



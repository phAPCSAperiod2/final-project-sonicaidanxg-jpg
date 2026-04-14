import java.util.ArrayList;

public class Quote{

    public static ArrayList<String> QuotesList = new ArrayList<>();
    private String text;
    private String author;


    /*
    Constructor for a quote.
    Adds quote to Quotes List

    @param text the text of the quote
    @param author the author of the quote
    @author Aidan Manzanares
    */

    public Quote(String text, String author){
        this.text = text;
        this.author = author;
        QuotesList.add("\"" + text + "\" \n -" + author);
    }

    /*
    Overloaded constructor for quote without author param.

    @param text the text of the quote
    @author Aidan Manzanares
    */

    public Quote(String text){
        this.text = text;
        this.author = null;
        QuotesList.add("\"" + text + "\" \n -Author Unknown");
    }

    /**
     * Returns the entire QuoteList
     *
     * @return QuotesList
     * @author Aidan Manzanares
     */
    public ArrayList returnQuoteList(){
        return QuotesList;
    }

    /*
    Returns random quote from QuotesList
    @return String
    @author Aidan Manzanares
     */
    public String returnRandQuote(){
        return QuotesList.get((int) Math.random()*((QuotesList.size() - 1) + 1));
    }

    /*
    Creates a new quote object which is automatically added to the quoteList.
    @param text The text of the quote.
    @param author The author of the quote.
    @author Aidan Manzanares
    */
    public void addQuote(String text, String author){
        Quote q = new Quote(text, author);
    }


    /*
    Creates a quote object without an author.
    @param text The text of the quote.
    @author Aidan Manzanares.
    */

    public void addQuote(String text){
        Quote q = new Quote(text);
    }

    /*
    Removes a quote from the quotelist using an index starting at 1
    @param index The index of the quote starting from 1.
    @author Aidan Manzanares.
    */
    public void removeQuote(int index){
        QuotesList.remove(index - 1);
    }

}

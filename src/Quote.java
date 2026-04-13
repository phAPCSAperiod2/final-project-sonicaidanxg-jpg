import java.util.ArrayList;

public class Quote{

    public ArrayList<String> QuotesList = new ArrayList<>();
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

    

}

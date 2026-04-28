import java.util.Scanner;

public class User{

    public void initializeLists(){

        System.out.println("Initializing lists...");

        Quote q = new Quote("First quote", "Author One");
        q.addQuote("Second quote", "Author Two");
        q.addQuote("Third quote");

        Image i = new Image("https://cdn12.picryl.com/photo/2016/12/31/deer-whitetail-fawn-animals-087653-1024.jpg", "Image1");
        i.addImage(i);
        Image b = new Image("https://pixnio.com/free-images/fauna-animals/deers/young-red-deer-fawn-odocoileus-virginianus.jpg", "Image2");
        i.addImage(b);
        Image c = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRg7mqOU8dEnsBAUEoHPwHRv3ITz0uOGnC5Vw&s", Image3);
        i.addImage(c);

        System.out.println("Lists initialized.");



    }

    




}

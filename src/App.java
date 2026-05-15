public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Initializing lists...");

        Quote q = new Quote("Don't be pushed around by the fears in your mind. Be led by the dreams in your heart.", "Roy T. Bennett");
        q.addQuote("Learn the rules like a pro, so you can break them like an artist.", "Pablo Picasso");
        q.addQuote("Live as if you were to die tomorrow. Learn as if you were to live forever.", "Mahatma Gandhi");

        Image i = new Image("https://cdn.printerval.com/unsafe/960x960/asset/111049560a1d1c1a0d1a1a141d56161d0c571115191f1d564c48484b404e4a4d4f5640414d4f571e14190c544f4d480054484f4d541e5508191c544f4d480049484848541e401e401e40560d495612081f",
                "HangInThere");
        i.addImage(i);
        Image b = new Image(
                "https://live.staticflickr.com/383/20238882830_cd090b63df_z.jpg",
                "TryMe");
        i.addImage(b);
        Image c = new Image(
                "https://images.pexels.com/photos/6005487/pexels-photo-6005487.jpeg", "WeBecome");
        i.addImage(c);

        System.out.println("Lists initialized.");

        User.loop(q, i);

    }
}

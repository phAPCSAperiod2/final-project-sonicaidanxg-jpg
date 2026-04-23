import java.util.ArrayList;

public class Image {

    public static ArrayList<Image> ImageList = new ArrayList<>();
    private String imageLink;
    private String identifier;

    /*
    Constructor for Image object.

    @param link The web url of the image.
    @param id A readable name to reference the image.
    @author Aidan Manzanares
    */


    public Image(String link, String id) {
        imageLink = link;
        identifier = id;
    }

    /*
    Returns the ImageList
    @return ArrayList
    @author Aidan Manzanares
    */


    public ArrayList returnImageList() {
        return ImageList;
    }

    /*
    Uses a web url to display an image.

    @author Aidan Manzanares
    */


    // wip
    public void displayRandImage() {
        Image f = ImageList.get((int) Math.random() * ((ImageList.size() - 1) + 1));
        String link = f.imageLink;
        System.out.println(link);
    }

    /*
    Adds an image object to the imageList.

    @author Aidan Manzanares
    */

    public void addImage(Image I) {
        ImageList.add(I);
    }


    /*
    Removes an image from the imageList using an index starting at 1.

    @author Aidan Manzanares
    */

    public void removeImage(int index) {
        ImageList.remove(index - 1);
    }

}

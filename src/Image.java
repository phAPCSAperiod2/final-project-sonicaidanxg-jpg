import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
    Picks a random image from imageList and displays it using the url.

    @author Aidan Manzanares
    */


    // wip
    public void displayRandImage() {

        //Checks if list is empty and returns.

        if (ImageList.isEmpty()) {
        System.out.println("No images to display.");
        return;
        }

        //Gets a random image object and the link

        Image f = ImageList.get((int) (Math.random() * ImageList.size()));
        String link = f.imageLink;
        // System.out.println(link);

        //Creates JFrame object

        JFrame frame = new JFrame();

        try{
            ImageIcon icon = new ImageIcon(new URL(link));
            JLabel label = new JLabel(icon);
            frame.add(label);
            frame.pack();
            frame.setVisible(true);
        }
        catch (Exception e) {
            System.out.println("Error displaying image: " + e.getMessage());
        }
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

    /*
    Returns the identifier for an image object.

    @return String
    @author Aidan Manzanares
    */
    public String toString(){
        return identifier;
    }

    /*
    Prints out the identifiers for all images in ImageList
    @author Aidan Manzanares
    */
    public void displayIDs(){
        for (Image i: ImageList){
            System.out.println(i);
        }
    }


}

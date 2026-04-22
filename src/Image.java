import java.util.ArrayList;

public class Image{

    public static ArrayList<Image> ImageList = new ArrayList<>();
    private String imageLink;
    private String identifier;

    public Image(String link, String id){
        imageLink = link;
        identifier = id;
    }


    public ArrayList returnImageList(){
        return ImageList;
    }


    //wip
    public void printRandImage(){
        ImageList.get((int) Math.random()*((ImageList.size() - 1) + 1));
    }


    public void addImage(Image I){
        ImageList.add(I);
    }

    public void removeImage(int index){
        ImageList.remove(index - 1);
    }




}

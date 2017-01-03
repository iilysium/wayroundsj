package anna.banana.wayroundsj;

/**
 * Created by Anna on 1/2/17.
 */

public class NewItem {
    String name;
    String description;
    int imageResource;

    public NewItem(String n, String d, int im) {
        this.name = n;
        this.description = d;
        this.imageResource = im;
    }

    public String getNameDescription() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }
}
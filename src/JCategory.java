import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad on 02/11/2017.
 */
public class JCategory {
    public String name;
    public String description;
    public String imageURL;
    public List<JItem> items = new ArrayList<>();

    public JCategory(String name, String description, String imageURL) {
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
    }
    public void addItem(JItem...items) {
        for (JItem item : items) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        return "JCategory{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", items=" + items +
                '}';
    }
}

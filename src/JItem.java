import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad on 02/11/2017.
 */
public class JItem {
    public String name;
    public double basePrice;
    public String imageURL;
    public String description;
    List<JOption> options = new ArrayList<>();

    public JItem(String name, double basePrice, String imageURL, String description) {
        this.name = name;
        this.basePrice = basePrice;
        this.imageURL = imageURL;
        this.description = description;
    }

    public void addOption(JOption...options) {
        for (JOption option : options) {
            this.options.add(option);
        }
    }

    @Override
    public String toString() {
        return "JItem{" +
                "name='" + name + '\'' +
                ", basePrice=" + basePrice +
                ", imageURL='" + imageURL + '\'' +
                ", description='" + description + '\'' +
                ", options=" + options +
                '}';
    }
}

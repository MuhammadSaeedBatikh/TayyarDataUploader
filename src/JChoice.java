/**
 * Created by Muhammad on 02/11/2017.
 */
public class JChoice {
    public String name;
    public double addedPrice;
    public String description;

    public JChoice(String name, double addedPrice, String description) {
        this.name = name;
        this.addedPrice = addedPrice;
        this.description = description;
    }

    @Override
    public String toString() {
        return "JChoice{" +
                "name='" + name + '\'' +
                ", addedPrice=" + addedPrice +
                ", description='" + description + '\'' +
                '}';
    }
}

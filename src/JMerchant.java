import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad on 02/11/2017.
 */
public class JMerchant {
    public String type;
    public String name;
    public String phone;
    public String address;
    public String imageURL;
    public int pricing;
    public List<String> actualCategories = new ArrayList<>();

    List<JCategory> categories = new ArrayList<>();

    public JMerchant(String type, String name, String phone, String address, String imageURL, int pricing, List<String> actualCategories) {
        this.type = type;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.imageURL = imageURL;
        this.pricing = pricing;
        this.actualCategories = actualCategories;
    }

    public void addCategory(JCategory...categories) {
        for (JCategory jCategory : categories) {
            this.categories.add(jCategory);
        }
    }

    @Override
    public String toString() {
        return "JMerchant{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", pricing=" + pricing +
                ", actualCategories=" + actualCategories +
                ", categories=" + categories +
                '}';
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad on 02/11/2017.
 */
public class Test {
    public String name;
    public double basePrice;
    List<String> list = new ArrayList(){{
        add("bla");
        add("bla 2");
    }};

    public Test(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }
}

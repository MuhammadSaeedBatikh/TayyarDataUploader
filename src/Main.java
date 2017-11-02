import com.google.gson.Gson;
import org.codehaus.jackson.map.ObjectMapper;

import java.awt.event.KeyAdapter;
import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Root root = createData();
        try (FileWriter writer = new FileWriter("tayyar_data.json")) {
            gson.toJson(root, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader("tayyar_data.json")) {
            root = gson.fromJson(reader, Root.class);
            System.out.println("root = " + root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Root createData() {
        ArrayList<String> actualCategories = new ArrayList() {{
            add("chicken");
            add("pizza");
            add("seafood");
        }};

        Root root = new Root();

        //create merchants
        JMerchant el_shabrawy = new JMerchant("r", "el shabrawy", "01000551",
                "bla/bla", "www.", 5, actualCategories);
        JMerchant arabatia = new JMerchant("r", "arabatia", "01000551",
                "bla/bla", "www.", 5, actualCategories.subList(0, 1));


        //create categories
        JCategory chickenCategory = new JCategory("����", "description 1", "www.url.com");
        JCategory pizzaCategory = new JCategory("�����", "description 2", "www.url.com");
        JCategory seafoodCategory = new JCategory("���", "description 3", "www.url.com");


        //create items
        JItem chicken = new JItem("����", 20, "www", "���� �����");
        JItem fish = new JItem("��� ����", 30, "www", "���� ��� ����");
        JItem cheesePizza = new JItem("���� ����", 25, "www", "���� ��������");
        JItem tunaPizza = new JItem("���� ����", 25, "www", "���� �������");


        //create Options
        JOption size = new JOption("size", true, true, "desc");
        JOption additions = new JOption("additions", false, false, "desc");


        //create choices
        JChoice large = new JChoice("large", 20, "");
        JChoice medium = new JChoice("medium", 10, "");
        JChoice small = new JChoice("small", 5, "");

        JChoice ketchup = new JChoice("ketchup", 0, "����� �����");
        JChoice mayo = new JChoice("mayo", 0, "����� �������");




        //add choices to Options
        size.addChoice(large, medium, small);
        additions.addChoice(ketchup, mayo);

        //add Options to items
        chicken.addOption(size);
        fish.addOption(size);
        cheesePizza.addOption(size, additions);
        tunaPizza.addOption(size, additions);

        //add items to categories
        chickenCategory.addItem(chicken);
        pizzaCategory.addItem(tunaPizza, cheesePizza);
        seafoodCategory.addItem(fish);

        //add categories to merchant
        el_shabrawy.addCategory(chickenCategory, pizzaCategory, seafoodCategory);
        arabatia.addCategory(chickenCategory, pizzaCategory);

        //add merchants to root
        root.addMerchant(el_shabrawy, arabatia);

        return root;
    }
}

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad on 02/11/2017.
 */
public class JOption {
    public String name;
    public boolean required;
    public boolean onlyOneChoice;
    public String description;
    List<JChoice> choices = new ArrayList<>();

    public JOption(String name, boolean required, boolean onlyOneChoice, String description) {
        this.name = name;
        this.required = required;
        this.onlyOneChoice = onlyOneChoice;
        this.description = description;
    }

    public void addChoice(JChoice... choices) {
        for (JChoice choice : choices) {
            this.choices.add(choice);
        }
    }

    @Override
    public String toString() {
        return "JOption{" +
                "name='" + name + '\'' +
                ", required=" + required +
                ", onlyOneChoice=" + onlyOneChoice +
                ", description='" + description + '\'' +
                ", choices=" + choices +
                '}';
    }
}

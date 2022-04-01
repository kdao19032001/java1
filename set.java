import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String[] args) {
        Set<String> items = new HashSet<>();
        items.add("A02");
        items.add("D03");
        items.add("D03");
        items.add("01");
        items.add("04");

        for (String item: items) {
            System.out.print(item + " ");
        }
    }
}
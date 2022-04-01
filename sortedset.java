import java.util.TreeSet;
import java.util. SortedSet;

public class sortedset {
    public static void main(String[] args) {
        SortedSet<String> sortedSetString = new TreeSet<String>();
        sortedSetString.add("A02");
        sortedSetString.add("D03");
        sortedSetString.add("D03");
        sortedSetString.add("01");
        sortedSetString.add("04");

        for (String ignored :  sortedSetString) {
            System.out.print( sortedSetString + " ");
        }
    }
}

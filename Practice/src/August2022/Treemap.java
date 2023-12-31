package August2022;

import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args){
        Map<String, Integer> values = new TreeMap<>();

        // Insert elements to map
        values.put("thirty", 30);

        values.put("Second", 2);
        values.put("First", 1);
        System.out.println("Map using TreeMap: " + values);

        // Replacing the values
        values.replace("First", 11);
        values.replace("Second", 22);
        System.out.println("New Map: " + values);

        // Remove elements from the map
        int removedValue = values.remove("First");
        System.out.println("Removed Value: " + removedValue);
    }

}

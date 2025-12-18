package ch_08_basic_types_collections_arrays.kotlin_java;

import java.util.List;

public class CollectionUtils {

    public static List<String> uppercaseAll(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        return items;
    }

}

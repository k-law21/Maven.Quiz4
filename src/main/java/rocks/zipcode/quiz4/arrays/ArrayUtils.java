package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        return removeAnElement(values, values.length/2);
    }

    public static String[] removeAnElement(String[] arr, int index) {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.remove(index);
        return list.toArray(new String[list.size()]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return removeAnElement(values, values.length - 1);
    }
}
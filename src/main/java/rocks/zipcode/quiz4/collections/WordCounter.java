package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    String[] arr;
    public WordCounter(String... strings) {
        arr = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> map = new HashMap<>();
        for(String x : arr){
            if(map.containsKey(x)){
                map.replace(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
        return map;
    }
}
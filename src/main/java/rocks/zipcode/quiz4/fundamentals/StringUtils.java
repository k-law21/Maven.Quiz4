package rocks.zipcode.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return midCase(str, true);
    }

    private static String midCase(String str, boolean upper){
        String[] arr = str.split("");
        arr[str.length()/2] = upper? arr[str.length()/2].toUpperCase() : arr[str.length()/2].toLowerCase();
        StringBuilder b = new StringBuilder();
        for(String x : arr){b.append(x);}
        return b.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return midCase(str, false);
    }

    public static Boolean isIsogram(String str) {
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        return set.size() == str.length();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] arr = str.toCharArray();
        char last = arr[0];
        for(int i = 1; i < str.length(); i++){
            if(arr[i] == last) return true;
            last = arr[i];
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        List<String> letters = new ArrayList<>(Arrays.asList(str.split("")));
        for(int i = 0; i < letters.size() - 1;){
            if(letters.get(i).equals(letters.get(i+1))){
                letters.remove(i);
                letters.remove(i);
            } else {
                i++;
            }
        }
        return String.join("", letters);
    }

    public static String invertCasing(String str) {
        char[] arr = str.toCharArray();
        int count = 0;
        for(char x : arr){
            if(Character.isUpperCase(x)){
                arr[count] = Character.toLowerCase(x);
            } else {
                arr[count] = Character.toUpperCase(x);
            }
            count++;
        }
        return new String(arr);
    }
}